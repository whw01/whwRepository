package com.whw.com.whw.singleResponsibility;

/**
 * 单一职责原则
 * 不是很单纯的单一职责
 */
public class Sr1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.roadRun("汽车");
        vehicle.airRun("飞机");
        vehicle.waterRun("轮船");
    }
}

class Vehicle {

    public void roadRun(String vehicleName){
        System.out.println(vehicleName + "在公路上运行");
    }
    public void airRun(String vehicleName){
        System.out.println(vehicleName + "在天空中运行");
    }
    public void waterRun(String vehicleName){
        System.out.println(vehicleName + "在水上运行");
    }
}
