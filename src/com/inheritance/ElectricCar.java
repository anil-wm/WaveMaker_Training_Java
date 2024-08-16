package com.inheritance;

public class ElectricCar extends ElectricVehicle{

    private int numberOfSeats;

    ElectricCar(String brand, int speed, int batteryCapacity, int numberOfSeats) {
        super(brand, speed, batteryCapacity);
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public void autoPilotFeature(){
        System.out.println("Electric Car has auto pilot feature.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        super.runsOn();
        System.out.println("Number of Seats: " + numberOfSeats);
        this.autoPilotFeature();
    }

}
