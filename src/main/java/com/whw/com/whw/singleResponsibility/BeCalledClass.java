package com.whw.com.whw.singleResponsibility;

/**
 * 同步：
 * synchronized
 * 锁类：
 *      锁类意味着锁住的是这个类所有的实例，同一时刻只有一个线程可以进入该类的某段同步代码（同步方法，同步代码块）。并不是说其他非同步的代码也不能走。
 * 锁对象：
 *      锁对象意味着锁的是当前实例，同一个类的其他实例之间同步的代码并不互通。
 */
public class BeCalledClass {
    public static int number = 0;
    public static void method1(){
        String name = Thread.currentThread().getName();
        System.out.println("thread_name:"+name);
        System.out.println("进入method1...");
        if(number == 0){
            System.out.println("进入if...");
            //测试这个同步锁到底锁到哪
            if(name=="thread1"){
                System.out.println("thread1睡2秒...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (BeCalledClass.class){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name+"进入同步代码块");
                number = ++number;
            }
        }else{
            System.out.println("进入到else....");
        }
    }
}
