package com.corestocy.exception;
/*
Exception: An unwanted unexpected event that disturbs the normal flow of the program is called exception.
The main goal of exception handling is graceful (normal) termination of the program.
Exception handling doesn't mean repairing an exception. We have to define alternative way to continue the rest of the program normally
this way of "defining alternative is nothing but exception handling".
Example: Suppose our programming requirement is to read data from a remote file located in London
at runtime if a London file is not available, our program should not be terminated abnormally.

An exception is an abnormal condition or error that occurs during the execution of a program.
Java provides a robust way to handle these errors to prevent program crashes.

Checked Exceptions: Known at compile-time (e.g., IOException).
Unchecked Exceptions: Known at runtime (e.g., NullPointerException).
  2. Exception Hierarchy
All exceptions are subclasses of Throwable. Key classes are:
   3. Exception Handling
Keywords
try: Block of code to monitor for exceptions.
catch: Handles exceptions.
finally: Executes code after try-catch, regardless of exception occurrence.
throw: Used to explicitly throw an exception.
throws: Declares exceptions that a method might throw.
Throwable
Error: For critical issues like OutOfMemoryError.
Exception: For recoverable issues.

Return Vs Finally:
Even though return present in try or catch blocks first finally will be executed,
and after that, only a return statement will be considered that is finally block dominates a return statement.
There is only one situation where the finally block won't be executed is whenever we are using System.exit(0) method.
Then JVM itself will be shutdown , in this case finally block won't be executed.
i.e., System.exit(0); dominates finally block.*/


public class ExceptionExample {
    public static void main(String[] args) {

        // Normal Flow
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
//            Within the try block if anywhere an exception raised then rest of the try block won't be executed even though we handled that exception.
            System.out.println("If exception happen in above line this statement not execute");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
            // If we want set/execute values at the time of executing catch block, we can mention here
            // Bcz, If any exception happens in try block at that time, the entire catch block will execute until there is no exception in catch block
        } finally {
            System.out.println("The finally block executes even if an exception occurs or not");
         /*Hence the main goal of finally block is to maintain cleanup code.
         There is only one situation where the finally block won't be executed is whenever we are using System.exit(0) method.
            Then JVM itself will be shutdown, in this case finally block won't be executed.
                i.e., System.exit(0); dominates finally block.*/
        }
        System.out.println();


        //Multiple Catch Blocks
        //Java allows multiple catch blocks for handling different exceptions.
        System.out.println("Multiple Catch Blocks");
        try {
            int num[] = {8,9,23};
            int value =num[5];
        }catch ( ArithmeticException e){
            System.out.println("ArithmeticException" + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException  " +e);
        }catch (Exception e){
            System.out.println("Exception"+e);
        }finally {
            System.out.println("Final block");
        }
        System.out.println();


        // Throw: throw keyword is used to explicitly throw an exception
        System.out.println("Throws");
        try {
            ageValidation(19);
        }catch (Exception e){
            System.out.println("Exception -> "+e);
        }
        System.out.println();


        //Implementing Custom Exception
        System.out.println("Implementing Custom Exception");
        try {
            validation(13);
        }catch (CustomException c){
            System.out.println("CustomException -> "+c);
        }
    }


    static void ageValidation(int age) throws Exception{
        if (age < 18) {
            throw new Exception("Not eligible!");
        }
            System.out.println("Eligible person");
    }

    static void validation(int age1) throws CustomException{
        if (age1 <18){
            throw new CustomException("custom Exception: ");
        }
        System.out.println("normal");
    }
}


/*
Best Practices
Always use specific exception types in catch blocks.
Avoid swallowing exceptions (e.g., using empty catch blocks).
Log exceptions using frameworks like java.util.logging or SLF4J.
Use try-with-resources for auto-closing resources.
Define custom exceptions for specific business rules.*/
