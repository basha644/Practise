package com.corestocy.multithreading;



 class BathRoom extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " entered in BathRoom");
        System.out.println(Thread.currentThread().getName() + " doing something,,,,,");
        System.out.println(Thread.currentThread().getName() + " exited BathRoom");
    }
}

 public class MultiThreadOneRun{
     public static void main(String[] args) {
         BathRoom b = new BathRoom();
         BathRoom b1 = new BathRoom();
         BathRoom b2 = new BathRoom();

         b.setName("Girl");
         b1.setName("Boy");
         b2.setName("others");
         b.start();
         b1.start();
         b2.start();
         System.out.println("something,,, something...");


     }
}
