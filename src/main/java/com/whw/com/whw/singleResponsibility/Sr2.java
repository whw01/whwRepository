package com.whw.com.whw.singleResponsibility;

/**
 * 严格的单一职责
 */
public class Sr2 {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1();
        vehicle1.run("汽车");
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("飞机");
    }
}
//单一职责
//汽车类
class Vehicle1 {

    public void run(String vehicleName){
        this.addEnergy(vehicleName);
        System.out.println(vehicleName + "在公路上运行");
    }

    private void addEnergy(String vehicleName){
        System.out.println(vehicleName + "加汽油。");
    }
}
//飞机类
class Vehicle2 {

    public void run(String vehicleName){
        this.addEnergy(vehicleName);
        System.out.println(vehicleName + "在天空运行");
    }

    private void addEnergy(String vehicleName){
        System.out.println(vehicleName + "加航空燃油。");
    }
}