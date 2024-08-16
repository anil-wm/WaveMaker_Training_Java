package com.inheritance;

public class ElectricBike extends ElectricVehicle{
    private boolean hasGenerativeBraking;

    public ElectricBike(String brand, int speed, int batteryCapacity,boolean hasGenerativeBraking) {
        super(brand,speed,batteryCapacity);
        this.hasGenerativeBraking = hasGenerativeBraking;
    }


    @Override
    public int getBatteryCapacity() {
        return super.getBatteryCapacity();
    }

    @Override
    public void autoPilotFeature() {
        System.out.println("Electric Bike has no autopilot feature.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        super.runsOn();
        System.out.println("has generative braking "+hasGenerativeBraking);
        this.autoPilotFeature();
    }
}
