package com.whw.com.whw.design.singleton.type1;

public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance.hashCode()="+instance.hashCode());
        System.out.println("instance1.hashCode()="+instance1.hashCode());
    }
}

//饿汉式（静态变量）

class Singleton {

    //1.构造器私有化，防止new
    private Singleton(){

    }

    //2.本类内部通过静态变量创建对象
    private final static Singleton SINGLETON = new Singleton();

    //3.对外提供静态getInstance方法
    public static Singleton getInstance(){
        return SINGLETON;
    }
}