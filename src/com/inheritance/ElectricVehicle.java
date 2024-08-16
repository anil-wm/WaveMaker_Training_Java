package com.inheritance;

public abstract class ElectricVehicle extends Vehicle implements Electric   {
    protected int batteryCapacity;

    public ElectricVehicle(String brand, int speed,int batteryCapacity) {
        super(brand,speed);
        this.batteryCapacity = batteryCapacity;
    }

    void runsOn(){
        System.out.println("An electric vehicle runs on electricity.");
    }
    abstract void autoPilotFeature();


    @Override
    void displayInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
