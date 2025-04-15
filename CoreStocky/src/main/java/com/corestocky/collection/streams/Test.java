package com.corestocky.collection.streams;

public class Test {
        // Static variable
        static int staticCounter = 0;

        // Instance variable
        int instanceCounter = 0;

        // Static method
        public static void incrementStaticCounter() {
            staticCounter++;
            System.out.println("Static Counter: " + staticCounter);
        }

        // Instance method
        public void incrementInstanceCounter() {
            instanceCounter++;
            System.out.println("Instance Counter: " + instanceCounter);
        }

        public static void main(String[] args) {
            // Calling static method
            Test.incrementStaticCounter(); // Output: Static Counter: 1
            Test.incrementStaticCounter(); // Output: Static Counter: 2

            // Creating an instance of Test
            Test Test1 = new Test();
            Test1.incrementInstanceCounter(); // Output: Instance Counter: 1


            // Creating another instance of Test
            Test Test2 = new Test();
            Test2.incrementInstanceCounter(); // Output: Instance Counter: 1
        }


}
