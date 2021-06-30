package com.whw.com.whw.design.singleton.type2;

public class SingletonTest2 {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2==instance1);
        System.out.println("instance1.hashCode()="+instance1.hashCode());
        System.out.println("instance2.hashCode()="+instance2.hashCode());
    }
}


//饿汉式（静态代码块）
class SingleTon {
    //1.构造方法私有化
    private SingleTon(){

    }

    //2.静态变量
    private static SingleTon singleTon;

    //3.静态代码块实例化
    static {
        singleTon = new SingleTon();
    }

    //4.提供获取实例方法
    public static SingleTon getInstance(){
        return singleTon;
    }

}