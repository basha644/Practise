# Marico Supervisor Java - Architecture Diagrams

## 🏗️ System Architecture Diagrams

### 1. High-Level System Architecture

```mermaid
graph TB
    subgraph "Client Layer"
        MA[Mobile Apps<br/>Android/iOS]
        WP[Web Portal<br/>Angular]
        AD[Admin Dashboard<br/>Management]
    end
    
    subgraph "Load Balancer"
        LB[AWS Application<br/>Load Balancer]
    end
    
    subgraph "API Gateway"
        AG[Spring Boot<br/>API Gateway<br/>Authentication & Routing]
    end
    
    subgraph "Microservices Layer"
        subgraph "Core Services"
            SW[SFA Web<br/>:9003<br/>Main API]
            SC[SFA Cache<br/>:9004<br/>Mobile API]
            IDB[InterDB<br/>:9005<br/>Cross-DB Ops]
        end
        
        subgraph "Processing Services"
            SR[SFA Report<br/>:9006<br/>Reports]
            SRC[Report Compute<br/>:9007<br/>Processing]
            AT[Action Tracker<br/>:9010<br/>Audit]
        end
        
        subgraph "Support Services"
            FP[File Processor<br/>:9008<br/>Files]
            NT[Notification<br/>:9009<br/>Alerts]
            FS[Foot Sequence<br/>:9011<br/>Routes]
            DE[Data Exporter<br/>:9012<br/>Export]
        end
        
        subgraph "Shared Libraries"
            CM[Common<br/>Utilities]
            IE[InterDB Entity<br/>Models]
            SE[SFA Entity<br/>Models]
            SR_LIB[SFA Repository<br/>Data Access]
        end
    end
    
    subgraph "Data Layer"
        subgraph "Databases"
            PDB[(Primary MySQL<br/>marico_supervisor)]
            SDB[(Secondary MySQL<br/>Reports & Analytics)]
        end
        
        subgraph "Cache"
            RD[(Redis<br/>Session & Cache)]
        end
    end
    
    subgraph "External Services"
        AWS[AWS Services<br/>S3, SES, QuickSight]
        SMS[SMS Gateway<br/>Notifications]
        ERP[Legacy Systems<br/>ERP, CRM]
    end
    
    MA --> LB
    WP --> LB
    AD --> LB
    LB --> AG
    
    AG --> SW
    AG --> SC
    AG --> IDB
    AG --> SR
    AG --> SRC
    AG --> AT
    AG --> FP
    AG --> NT
    AG --> FS
    AG --> DE
    
    SW --> CM
    SC --> CM
    IDB --> IE
    SW --> SE
    SC --> SE
    SW --> SR_LIB
    SC --> SR_LIB
    
    SW --> PDB
    SC --> PDB
    IDB --> SDB
    SR --> SDB
    SRC --> SDB
    
    SC --> RD
    SW --> RD
    
    NT --> SMS
    FP --> AWS
    DE --> AWS
    SR --> AWS
    
    IDB --> ERP
```

### 2. Microservices Communication Pattern

```mermaid
graph LR
    subgraph "Frontend"
        M[Mobile App]
        W[Web Portal]
    end
    
    subgraph "API Layer"
        subgraph "Primary APIs"
            SW[SFA Web<br/>:9003]
            SC[SFA Cache<br/>:9004]
        end
        
        subgraph "Internal Services"
            IDB[InterDB<br/>:9005]
            SR[Reports<br/>:9006]
            AT[Action Tracker<br/>:9010]
            NT[Notification<br/>:9009]
        end
    end
    
    subgraph "Data Services"
        PDB[(Primary DB)]
        SDB[(Secondary DB)]
        RD[(Redis)]
    end
    
    M -->|REST API| SC
    W -->|REST API| SW
    
    SC -->|Internal API| SW
    SW -->|Internal API| IDB
    SW -->|Internal API| SR
    SW -->|Internal API| AT
    
    SW -->|Async| NT
    SR -->|Async| NT
    
    SW --> PDB
    SC --> PDB
    IDB --> SDB
    SR --> SDB
    
    SC --> RD
    SW --> RD
    
    style M fill:#e1f5fe
    style W fill:#e1f5fe
    style SW fill:#fff3e0
    style SC fill:#fff3e0
    style PDB fill:#f3e5f5
    style RD fill:#ffebee
```

### 3. Data Flow Architecture

```mermaid
graph TD
    subgraph "Data Sources"
        MS[Mobile Sync]
        WI[Web Input]
        EI[External Integration]
        SI[Scheduled Import]
    end
    
    subgraph "Processing Layer"
        subgraph "Validation"
            IV[Input Validation]
            BV[Business Validation]
            DV[Data Validation]
        end
        
        subgraph "Business Logic"
            BL[Business Rules]
            WF[Workflow Engine]
            TR[Transaction Manager]
        end
        
        subgraph "Data Processing"
            DP[Data Processor]
            AG[Aggregation Engine]
            CE[Compute Engine]
        end
    end
    
    subgraph "Storage Layer"
        subgraph "Transactional"
            TD[Transaction Data]
            MD[Master Data]
            CD[Configuration Data]
        end
        
        subgraph "Analytical"
            RD[Report Data]
            AD[Aggregated Data]
            HD[Historical Data]
        end
        
        subgraph "Cache"
            SC[Session Cache]
            DC[Data Cache]
            RC[Report Cache]
        end
    end
    
    subgraph "Output Layer"
        API[REST APIs]
        RPT[Reports]
        NOT[Notifications]
        EXP[Data Export]
    end
    
    MS --> IV
    WI --> IV
    EI --> IV
    SI --> IV
    
    IV --> BV
    BV --> DV
    DV --> BL
    
    BL --> WF
    WF --> TR
    TR --> DP
    
    DP --> AG
    AG --> CE
    
    DP --> TD
    DP --> MD
    DP --> CD
    
    CE --> RD
    CE --> AD
    CE --> HD
    
    TD --> SC
    MD --> DC
    RD --> RC
    
    TD --> API
    RD --> RPT
    DP --> NOT
    AD --> EXP
```

### 4. Security Architecture

```mermaid
graph TB
    subgraph "Client Security"
        SSL[SSL/TLS<br/>Encryption]
        CT[Client<br/>Certificates]
        AT[App<br/>Authentication]
    end
    
    subgraph "API Gateway Security"
        subgraph "Authentication"
            JWT[JWT Tokens]
            OAUTH[OAuth 2.0]
            MSAL[MSAL Integration]
        end
        
        subgraph "Authorization"
            RBAC[Role-Based<br/>Access Control]
            ACL[Access Control<br/>Lists]
            RP[Resource<br/>Protection]
        end
        
        subgraph "Validation"
            IV[Input<br/>Validation]
            RV[Request<br/>Validation]
            SV[Schema<br/>Validation]
        end
    end
    
    subgraph "Service Security"
        subgraph "Inter-Service"
            ISA[Internal Service<br/>Authentication]
            API_KEY[API Key<br/>Management]
            MT[Mutual TLS]
        end
        
        subgraph "Data Protection"
            ENC[Data<br/>Encryption]
            HASH[Password<br/>Hashing]
            MASK[Data<br/>Masking]
        end
    end
    
    subgraph "Database Security"
        subgraph "Access Control"
            DBA[Database<br/>Authentication]
            DBR[Database<br/>Roles]
            CLS[Column Level<br/>Security]
        end
        
        subgraph "Data Security"
            TDE[Transparent Data<br/>Encryption]
            BKP[Encrypted<br/>Backups]
            AUD[Audit<br/>Logging]
        end
    end
    
    SSL --> JWT
    CT --> OAUTH
    AT --> MSAL
    
    JWT --> RBAC
    OAUTH --> ACL
    MSAL --> RP
    
    RBAC --> IV
    ACL --> RV
    RP --> SV
    
    IV --> ISA
    RV --> API_KEY
    SV --> MT
    
    ISA --> ENC
    API_KEY --> HASH
    MT --> MASK
    
    ENC --> DBA
    HASH --> DBR
    MASK --> CLS
    
    DBA --> TDE
    DBR --> BKP
    CLS --> AUD
```

### 5. Deployment Architecture

```mermaid
graph TB
    subgraph "Production Environment"
        subgraph "Load Balancer Tier"
            ALB[Application<br/>Load Balancer]
            SSL_TERM[SSL<br/>Termination]
        end
        
        subgraph "Application Tier"
            subgraph "Auto Scaling Group"
                APP1[App Server 1<br/>EC2 Instance]
                APP2[App Server 2<br/>EC2 Instance]
                APP3[App Server N<br/>EC2 Instance]
            end
        end
        
        subgraph "Database Tier"
            subgraph "RDS Cluster"
                RDS_M[RDS Master<br/>MySQL]
                RDS_R1[RDS Read Replica 1]
                RDS_R2[RDS Read Replica 2]
            end
            
            subgraph "Cache Tier"
                REDIS_M[Redis Master]
                REDIS_S[Redis Slave]
            end
        end
        
        subgraph "Storage Tier"
            S3[S3 Bucket<br/>File Storage]
            EFS[EFS<br/>Shared Storage]
        end
    end
    
    subgraph "Monitoring & Logging"
        CW[CloudWatch<br/>Monitoring]
        ELK[ELK Stack<br/>Logging]
        PROM[Prometheus<br/>Metrics]
    end
    
    subgraph "CI/CD Pipeline"
        GIT[Git Repository]
        JENKINS[Jenkins<br/>Build Server]
        DOCKER[Docker<br/>Registry]
        DEPLOY[Deployment<br/>Scripts]
    end
    
    ALB --> SSL_TERM
    SSL_TERM --> APP1
    SSL_TERM --> APP2
    SSL_TERM --> APP3
    
    APP1 --> RDS_M
    APP2 --> RDS_M
    APP3 --> RDS_M
    
    RDS_M --> RDS_R1
    RDS_M --> RDS_R2
    
    APP1 --> REDIS_M
    APP2 --> REDIS_M
    APP3 --> REDIS_M
    
    REDIS_M --> REDIS_S
    
    APP1 --> S3
    APP2 --> EFS
    
    APP1 --> CW
    APP2 --> ELK
    APP3 --> PROM
    
    GIT --> JENKINS
    JENKINS --> DOCKER
    DOCKER --> DEPLOY
    DEPLOY --> APP1
```

### 6. Database Schema Architecture

```mermaid
erDiagram
    COMPANY {
        varchar cmpCode PK
        varchar cmpName
        varchar address
        date createdDate
    }
    
    DISTRIBUTOR {
        varchar cmpCode PK
        varchar distrCode PK
        varchar distrName
        varchar address
        varchar contactPerson
    }
    
    SALESMAN {
        varchar cmpCode PK
        varchar distrCode PK
        varchar salesmanCode PK
        varchar salesmanName
        varchar mobileNumber
        varchar imei
        date joiningDate
    }
    
    CUSTOMER {
        varchar cmpCode PK
        varchar distrCode PK
        varchar customerCode PK
        varchar customerName
        varchar address
        varchar contactNumber
    }
    
    PRODUCT {
        varchar cmpCode PK
        varchar productCode PK
        varchar productName
        varchar category
        decimal mrp
        varchar uom
    }
    
    ORDER_HEADER {
        varchar cmpCode PK
        varchar orderNo PK
        varchar distrCode
        varchar salesmanCode
        varchar customerCode
        date orderDate
        decimal totalAmount
        varchar status
    }
    
    ORDER_DETAIL {
        varchar cmpCode PK
        varchar orderNo PK
        varchar productCode PK
        int quantity
        decimal rate
        decimal amount
    }
    
    PJP_ADHERENCE_REPORT {
        varchar CmpCode PK
        varchar DistrCode PK
        varchar sdCode PK
        date coveragedt PK
        varchar salesmanCode
        varchar salesmanName
        date date
        varchar pjpAdherence
        varchar geoAdherence
    }
    
    COMPANY ||--o{ DISTRIBUTOR : has
    DISTRIBUTOR ||--o{ SALESMAN : employs
    DISTRIBUTOR ||--o{ CUSTOMER : serves
    COMPANY ||--o{ PRODUCT : manufactures
    SALESMAN ||--o{ ORDER_HEADER : creates
    CUSTOMER ||--o{ ORDER_HEADER : places
    ORDER_HEADER ||--o{ ORDER_DETAIL : contains
    PRODUCT ||--o{ ORDER_DETAIL : includes
    SALESMAN ||--o{ PJP_ADHERENCE_REPORT : reports
```

### 7. Integration Flow

```mermaid
sequenceDiagram
    participant M as Mobile App
    participant C as SFA Cache
    participant W as SFA Web
    participant I as InterDB
    participant R as Reports
    participant N as Notification
    participant D as Database
    participant E as External System
    
    Note over M,E: Order Processing Flow
    
    M->>C: Create Order Request
    C->>C: Validate Input
    C->>W: Process Order
    W->>D: Save Order Data
    D-->>W: Order Saved
    W->>I: Update Inter-DB
    I->>I: Cross-DB Sync
    W->>N: Send Notification
    N->>E: SMS/Email Alert
    W-->>C: Order Processed
    C-->>M: Success Response
    
    Note over M,E: Report Generation Flow
    
    M->>C: Request Report
    C->>R: Generate Report
    R->>D: Query Data
    D-->>R: Raw Data
    R->>R: Process & Compute
    R->>E: Store in S3
    R-->>C: Report URL
    C-->>M: Download Link
    
    Note over M,E: Sync Process
    
    W->>I: Scheduled Sync
    I->>E: Fetch External Data
    E-->>I: External Data
    I->>D: Update Database
    I->>N: Sync Notification
    N->>M: Push Notification
```

### 8. Caching Strategy

```mermaid
graph TB
    subgraph "Application Layer"
        APP["Application Services"]
    end
    
    subgraph "Cache Layers"
        subgraph "L1 Cache - Application"
            AC["Application Cache @Cacheable"]
        end
        
        subgraph "L2 Cache - Redis"
            subgraph "Session Cache"
                SC["User Sessions JWT Tokens Auth Data"]
            end
            
            subgraph "Data Cache"
                MC["Master Data Products Customers"]
                TC["Transaction Cache Recent Orders Inventory"]
            end
            
            subgraph "Report Cache"
                RC["Report Data Dashboard Analytics"]
            end
        end
    end
    
    subgraph "Database Layer"
        PDB[("Primary Database")]
        SDB[("Secondary Database")]
    end
    
    APP --> AC
    AC -->|"Cache Miss"| SC
    AC -->|"Cache Miss"| MC
    AC -->|"Cache Miss"| TC
    AC -->|"Cache Miss"| RC
    
    SC -->|"Cache Miss"| PDB
    MC -->|"Cache Miss"| PDB
    TC -->|"Cache Miss"| PDB
    RC -->|"Cache Miss"| SDB
    
    PDB -->|"Update"| MC
    PDB -->|"Update"| TC
    SDB -->|"Update"| RC
    
    style AC fill:#e8f5e8
    style SC fill:#fff3cd
    style MC fill:#fff3cd
    style TC fill:#fff3cd
    style RC fill:#fff3cd
    style PDB fill:#f8d7da
    style SDB fill:#f8d7da
```

---

## 📊 Performance Metrics

### Service Response Times
- **SFA Web**: < 200ms (95th percentile)
- **SFA Cache**: < 100ms (95th percentile)
- **Reports**: < 2s (complex reports)
- **Database Queries**: < 50ms (simple), < 500ms (complex)

### Scalability Targets
- **Concurrent Users**: 1000+ active users
- **API Throughput**: 10,000 requests/minute
- **Database Connections**: 100 concurrent connections
- **Cache Hit Ratio**: > 90%

### Availability Targets
- **Uptime**: 99.9% availability
- **Recovery Time**: < 15 minutes
- **Backup Frequency**: Daily automated backups
- **Disaster Recovery**: < 4 hours RTO

---

*These diagrams provide a visual representation of the Marico Supervisor Java architecture. Use them as reference for understanding system interactions and data flows.*