package com.whw.com.whw.design.singleton.type4;

public class SingletonTest4 {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2==instance1);
        System.out.println("instance1.hashCode()="+instance1.hashCode());
        System.out.println("instance2.hashCode()="+instance2.hashCode());
    }
}

//懒汉式（线程安全，同步方法）效率低
class SingleTon {

    private SingleTon(){

    }

    private static SingleTon singleTon;

    public static synchronized SingleTon getInstance(){
        if(singleTon==null){
            singleTon=new SingleTon();
        }
        return singleTon;
    }

}
