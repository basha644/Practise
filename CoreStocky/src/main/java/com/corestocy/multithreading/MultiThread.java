package com.corestocy.multithreading;
/*
Thread Scheduler will decided like which one need to run first,
we can exact result it will depend on ThreadScheduler
*/

class Song implements Runnable{
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

    class Video implements Runnable{
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
class Chat implements Runnable{
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

public class MultiThread {
    public static void main(String[] args) {
        Song s = new Song();
        Video v = new Video();
        Chat c = new Chat();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(v);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();

    }
}
