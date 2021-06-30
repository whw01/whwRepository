package com.whw.com.whw;

import com.whw.com.whw.singleResponsibility.Thread2;

public class ThreadTest {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }

}
