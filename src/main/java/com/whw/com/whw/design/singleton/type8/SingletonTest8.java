package com.whw.com.whw.design.singleton.type8;

public class SingletonTest8 {

    public static void main(String[] args) {
        //两次获取的实例对象是一致的
        SingleTon instance = SingleTon.INSTANCE;
        SingleTon instance1 = SingleTon.INSTANCE;
        System.out.println(instance.name());
        System.out.println(instance);
        System.out.println(instance==instance1);
    }

}
//使用枚举实现单例
enum SingleTon {

    INSTANCE(1,"name");

    private int age;

    private String name;

    private SingleTon(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "age:"+this.age+"-name:"+name;
    }
}


