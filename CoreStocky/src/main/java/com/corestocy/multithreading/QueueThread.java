package com.corestocy.multithreading;
class Producer extends Thread
{
    Queue1 q;

    public Producer(Queue1 y)
    {

        q=y;

    }
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {

            q.put(i++);

        }

    }
}

class Consumer extends Thread
{

    Queue1 q;

    public Consumer(Queue1 y)
    {
        q=y;

    }
    @Override
    public void run()
    {
        while(true)
        {
            q.get();
        }
    }

}
class Queue{

    int x;
    public void put(int value){
        x=value;
        System.out.println("I have produced the data into x : " + x);
    }
    public void get(){
        System.out.println("value consumed: "+ x);
    }

}

public class QueueThread {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);

        p.start();
        c.start();
    }

}
