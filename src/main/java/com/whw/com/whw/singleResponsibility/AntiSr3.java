package com.whw.com.whw.singleResponsibility;

/**
 * 违反单一职责原则
 * 一个类干了多种交通工具的职责，是不合理的。
 */
public class AntiSr3 {

    public static void main(String[] args) {
        Vehicle4 vehicle4 = new Vehicle4();
        vehicle4.run("飞机");
        vehicle4.run("汽车");
        vehicle4.run("轮船");
    }
}

class Vehicle4 {
    public void run(String vehicleName){
        System.out.println(vehicleName + "在公路上运行");
    }
}
