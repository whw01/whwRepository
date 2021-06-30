package com.whw.com.whw.design.singleton.type7;

public class SingletonTest7 {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2==instance1);
        System.out.println("instance1.hashCode()="+instance1.hashCode());
        System.out.println("instance2.hashCode()="+instance2.hashCode());
    }
}

class SingleTon{

    private SingleTon(){

    }
    //利用静态内部类的特性，主类装载时  静态内部类不会装载，只有用到静态内部类时才会装载，保证了懒加载和线程安全
    private static class MySingleTon {

        private static SingleTon singleTon = new SingleTon();

    }

    public static SingleTon getInstance(){
        return MySingleTon.singleTon;
    }
}
