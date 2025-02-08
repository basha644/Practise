package com.corestocy.multithreading;

import java.util.Scanner;

class Banking1 extends Thread
{

    @Override
    public void run()
    {
        System.out.println("Activity 1 started");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you account num");
        int ac=scan.nextInt();
        System.out.println("Enter you account password");
        int pw=scan.nextInt();

        System.out.println("please see the account details");

        System.out.println("Activity 1 ended");

        System.out.println("**************************************************");
    }

}

class PrintingNum1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Activity 2 started");
        for(int i=0;i<5;i++)
        {
            System.out.println("Activity2 values: "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("Activity 2 ended");

        System.out.println("**************************************************");


    }
}

class PrintingAlpha1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Activity 3 started");

        for(int i=65;i<70;i++)
        {
            System.out.println("Activity3 values: "+(char)i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        System.out.println("Activity 3 ended");
    }
}

public class MultiThread2
{

    public static void main(String[] args)throws Exception
    {

        System.out.println("Main Thread started ");

        System.out.println("Resources opening");
        Banking1 b=new Banking1();
        PrintingNum1 pn=new PrintingNum1();
        PrintingAlpha1 pa=new PrintingAlpha1();

        System.out.println(pn.isAlive());//false
        System.out.println(pa.isAlive());//false

        pn.start();
        pa.start();


        System.out.println(pn.isAlive());//true
        System.out.println(pa.isAlive());//true

        pn.join();
        pa.join();


        System.out.println("Resources closed"); // Before completing remaining threads, the main thread will be closed.
        // The Next Thread scheduler will take care remaining threads. If you want to see comment above join methods and run

        System.out.println("Main thread completed work");

//		b.run();
//		pn.run();
//		pa.run(); // program will behave like single threaded programming

    }

}
