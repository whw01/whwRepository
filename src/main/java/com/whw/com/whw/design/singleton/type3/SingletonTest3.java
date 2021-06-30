package com.whw.com.whw.design.singleton.type3;

public class SingletonTest3 {
    public static void main(String[] args) {

    }
}

//懒汉式（线程不安全）  不可用
//lazy load
class SingleTon {

    private SingleTon(){

    }

    private static SingleTon singleTon;

    public static SingleTon getInstance(){
        if(singleTon==null){//实现懒加载，但是存在线程同步问题，线程不安全
            singleTon=new SingleTon();
        }
        return singleTon;
    }
}
