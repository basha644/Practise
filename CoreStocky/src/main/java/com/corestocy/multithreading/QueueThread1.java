package com.corestocy.multithreading;

class Producer1 extends Thread
{
    Queue1 q;

    public Producer1(Queue1 y)
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

class Consumer1 extends Thread
{

    Queue1 q;

    public Consumer1(Queue1 y)
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

class Queue1
{
    int x;
    boolean flag=false;

    synchronized public void put(int data)
    {
        try
        {
            if(flag==true)
            {
                wait();
            }
            else
            {
                x=data;
                System.out.println("I have produced the data into x : " + x);
                flag=true;
                notify();
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }


    }

    synchronized public void get()
    {
        try
        {
            if(flag==false)
            {
                wait();
            }
            else
            {
                System.out.println("I have consumed the data from x : "+ x);
                flag=false;
                notify();
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }

    }


}


public class QueueThread1
{

    public static void main(String[] args)
    {

        Queue1 q=new Queue1();

        Producer1 pd=new Producer1(q);

        Consumer1 c=new Consumer1(q);

        pd.start();
        c.start();


    }

}
