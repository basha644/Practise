package corestocky;

public class Test2 {

    int a;
    int b;

    public Test2() {
    }

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        String serialNo="899193251021688115U";
        String serialNo1 = serialNo.substring(0, 19);
        String serialNo2 = "0" + serialNo1.substring(0, 18);
        System.out.println("serialNo1: " + serialNo1);
        System.out.println("serialNo2: " + serialNo2);
//        Test2 t1 = new Test2();
//        Test2 t2 = new Test2();
//        t1.a =10;
//        t1.b=20;
//        System.out.println(t1.a + " "+ t1.b);
//        System.out.println(t2.a + " "+ t2.b);
//        String authString = "Basic KAo7Qj3uJLvY5ec2+eOhiaI+kYa09Mwq";
//
//        if (authString == null || authString.trim().isEmpty()) {
//            System.out.println("nulll");        }

//        boolean isValid;
//        if (serialNo.contains(",")) {
//            // Split by comma and check the first part
//            String beforeComma = serialNo.split(",")[0];
//            isValid = beforeComma.length() <= 20;
//        } else {
//            // No comma, check entire string
//            isValid = serialNo.length() <= 20;
//        }
//
//        if (isValid) {
//            System.out.println("Valid number");
//        } else {
//            System.out.println("Invalid number");
//        }
    }
}
