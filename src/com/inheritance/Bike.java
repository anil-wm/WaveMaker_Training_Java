package com.inheritance;

public class Bike extends Vehicle{
    private int numberOfWheels;

    public Bike(String brand, int speed, int numberOfWheels) {
        super(brand,speed);
        this.numberOfWheels = numberOfWheels;
    }

    public int getnumberOfWheels() {
        return numberOfWheels;
    }

    public void setnumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void runsOn() {
        System.out.println("A Bike runs on Petrol");
    }

    @Override
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of wheels : " + getnumberOfWheels());
        this.runsOn();
    }
}
