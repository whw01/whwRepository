package com.whw.com.whw;

import com.whw.com.whw.singleResponsibility.BeCalledClass;

public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread1 is running...");
        BeCalledClass.method1();
    }
}
