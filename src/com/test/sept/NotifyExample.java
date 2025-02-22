package com.test.sept;

public class NotifyExample extends Thread {

    long sum;

    public void run()
    {
        synchronized (this)
        {
            for(int i =0;i<50;i++)
            {
                sum += i;
            }
            notify();
        }
    }

    public class ThreadWaitAndNotify

    {
        public static void main(String[] args) throws InterruptedException {

            NotifyExample thread = new NotifyExample();
            thread.start();

            synchronized (thread){
                thread.wait();
            }
            System.out.println("Sum is "+thread.sum);

        }
    }


}
