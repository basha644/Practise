package com.corestocy.multithreading;
/*
Thread Scheduler will decided like which one need to run first,
we can exact result it will depend on ThreadScheduler
*/

class Song1 extends Thread{
    @Override
    public void run() {
        System.out.println("Activity1 started");
        for (int i=0; i<=5; i++){
            System.out.println("Activity1 values: "+i) ;
            if (i ==3){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("Activity1 ended");
    }}

    class Video1 extends Thread{
        @Override
        public void run() {
            System.out.println("Activity2 started");
            for (int i=0; i<=5; i++){
                System.out.println("Activity2 values: "+i);
                if (i ==3){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            System.out.println("Activity2 ended");
        }
}
class Chat1 extends Thread{
    @Override
    public void run() {
        System.out.println("Activity3 started");
        for (int i=0; i<=5; i++){
            System.out.println("Activity3 values: "+i);
            if (i ==3){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("Activity3 ended");
    }
}

public class MultiThread1 {
    public static void main(String[] args) {

        Song1 t1 = new Song1(); // Already Song1 Thread class extends to Song1 class. So, all the parent class methods are available to child class
        Video1 t2 = new Video1();// we don't need to create a separate object for Thread class.
        Chat1 t3 = new Chat1();
        t1.start();
        t2.start();
        t3.start();

//        t1.run();
//        t2.run();
//        t3.run(); // Program will behave like a single threaded application

    }
}
