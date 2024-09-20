package com.oops;

public class ExecutionFlow {
	
	//
	 private static final String COMPANY_NAME = "Airtel";
	 private static final String DE = "Distributor";
	 private static final String FSE = "Salesman";

    // 1.
	 private String userName ="Akbar";
	 private long userMsisdn = 1234567890;
	 
	 static {
		 System.out.println("company Name: "+COMPANY_NAME);
	 }
	 
	 {
		System.out.println("Portal users: "+ DE +" ::: " +FSE); 
	 }
	 
	 ExecutionFlow (){
		 super();
//		 this();
		 System.out.println("Program Execution Flow");
	 }
	 
	 static void operations() {
		 System.out.println("Portal operations");
		 System.out.println("Purchase order");
		 System.out.println("Stock Adjustment");
		 System.out.println("Sell order");
	 }
	 
	 public void purchaseOrder() {
		 userDetails();
		 String productName ="DTH";
		 System.out.println("Salesman Name:"+productName);
	 }
	 
	 public void stockAdjustment() {
		 userDetails();
		 String productCount ="100";
		 System.out.println("Salesman Name:"+productCount);
	 }
	 
	 public void userDetails() {
		 System.out.println("User Details :"+userName+ "::::" +userMsisdn);
	 }
	 

	 public static void main(String[] args) {
		 ExecutionFlow ef = new ExecutionFlow();
		 ef.purchaseOrder();
		 ef.stockAdjustment();
		
	}

}
