package com.whw.com.whw.singleResponsibility;

public class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread2 is running...");
        BeCalledClass.method1();
    }
}
