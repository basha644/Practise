package com.corestocy.multithreading;

import java.util.Scanner;

// One run method with 3 thread creations
class Banking implements Runnable
{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equalsIgnoreCase("Admin")){
            activity1();
        } else if (name.equalsIgnoreCase("User")) {
            activity2();
        }else {
            activity3();
        }

    }
    public void activity1(){
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
    public void activity2(){
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
    public void activity3(){
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


public class MultiThread3
{

    public static void main(String[] args)throws Exception
    {

        System.out.println("Main Thread started ");

        System.out.println("Resources opening");
        Banking b=new Banking();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("Admin");
        t2.setName("User");
        t3.setName("Any");

        t1.start();
        t2.start();
        t3.start();

    }

}
