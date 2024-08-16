package com.inheritance;

abstract class Vehicle{
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract  void  displayInfo();

    abstract  void runsOn();

    void start(){
        System.out.println("Vehicle is starting.....");
    }
}
