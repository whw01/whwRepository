package com.whw.com.whw.design.singleton.type6;

public class SingletonTest6 {
}
//懒汉式（线程安全，双重检查）
class SingleTon{

    private SingleTon(){

    }
    //volatile作用：
    //1.保证线程之间的可见性
    //2.防止JVM对非原子操作进行指令重排，保证有序性
    private static volatile SingleTon singleTon;

    public static SingleTon getInstance(){
        if(singleTon==null){
            synchronized (SingleTon.class){
                //第二次判断，是为了防止多个线程同时通过了第一个if，进入到同步代码块时，防止再次创建实例
                if(singleTon==null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

}
