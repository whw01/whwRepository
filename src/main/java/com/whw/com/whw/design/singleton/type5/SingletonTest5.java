package com.whw.com.whw.design.singleton.type5;

public class SingletonTest5 {
}

//懒汉式（为了解决同步方法效率低的问题，改为同步代码块。）  不可用
//但是：下面的是错误示范
class SingleTon {

    private SingleTon(){

    }

    private static SingleTon singleTon;

    public static SingleTon getInstance(){
        if(singleTon==null){
            //并不能解决线程同步问题。原因是可能同一时刻多个线程都进if了，第一个线程创建了实例，第二个线程照样会创建实例。
            synchronized (SingleTon.class){
                singleTon = new SingleTon();
            }
        }
        return singleTon;
    }
}
