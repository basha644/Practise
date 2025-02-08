package com.corestocy.multithreading;

// Synchronized - only one thread allowed to do. If than one thread comes means they will wait until completion of the current thread.

 class BathRoom1 implements Runnable{
     @Override
     synchronized public void run(){
         try {
             System.out.println(Thread.currentThread().getName() + " entered in BathRoom");
             Thread.sleep(2000);
             System.out.println(Thread.currentThread().getName() + " doing something,,,,,");
             Thread.sleep(2000);
             System.out.println(Thread.currentThread().getName() + " exited BathRoom");
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

    }
}

class BathRoom2 implements Runnable{
    @Override
     public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " entered in BathRoom");
            Thread.sleep(2000);
            synchronized (this){ // only block act as synchronized
                System.out.println(Thread.currentThread().getName() + " doing something,,,,,");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " exited BathRoom");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

 public class MultiThreadOneRun1{
     public static void main(String[] args) {
//         BathRoom1 b = new BathRoom1();
         BathRoom2 b = new BathRoom2();


         Thread t = new Thread(b);
         Thread t1 = new Thread(b);
         Thread t2 = new Thread(b);


         t.setName("Girl");
         t1.setName("Boy");
         t2.setName("others");

         t.start();
         t1.start();
         t2.start();
         System.out.println("something,,, something...");


     }
}
