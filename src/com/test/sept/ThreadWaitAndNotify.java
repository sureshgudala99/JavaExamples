package com.test.sept;

public class ThreadWaitAndNotify {

    public static void main(String[] args) throws InterruptedException {

        NotifyExample thread = new NotifyExample();
        thread.start();

        synchronized (thread){
            thread.wait();
        }
        System.out.println("Sum is "+thread.sum);

    }
}
