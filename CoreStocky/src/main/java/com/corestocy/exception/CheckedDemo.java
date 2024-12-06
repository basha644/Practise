package com.corestocy.exception;

public class CheckedDemo {

    //
//    That is being checked during the compile time not happen in compile time.The Possibility of an exception checked by compiler
    // Checked Exception: It is also run time Exception but,The compiler tells possibility of exception while writing coding.
    // Compiler only can check the possibility of checked exception
//    In below we used throws keyword (throws InterruptedException) it acts like ducking the exception not handling exception.
//    It is not a good practice instead of which we need to handle exception with try and catch block
    public static void main(String[] args) throws InterruptedException { // checked Exception
        System.out.println("Hello!");
        Thread.sleep(2000);
        System.out.println("After 5 seconds Hello!");
    }

}

