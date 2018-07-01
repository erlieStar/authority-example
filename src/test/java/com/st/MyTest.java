package com.st;

public class MyTest {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        boolean flag1 = thread.isInterrupted();
        //false
        System.out.println(flag1);
        boolean flag2 = thread.isInterrupted();
        //false
        System.out.println(flag2);
    }
}
