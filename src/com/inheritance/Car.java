package com.inheritance;

public class Car extends  Vehicle{
    private int numberOfWheels;



    public Car(String brand, int speed, int numberOfWheels){
        super(brand,speed);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void runsOn() {
        System.out.println("A car runs on petrol or diesel fuel, depending on the engine type.");
    }

    @Override
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of wheels : " +getNumberOfWheels() );
        this.runsOn();
    }

}
