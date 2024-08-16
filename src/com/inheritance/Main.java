package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        Bike bike = new Bike("Harley", 120, 2);
        ElectricBike electricBike = new ElectricBike("Zero", 100, 15, true);
        ElectricCar electricCarCar = new ElectricCar("Tesla", 250, 75, 5);

        System.out.println("Car Info:");
        car.displayInfo();

        System.out.println("\nBike Info:");
        bike.displayInfo();

        System.out.println("\nElectric Bike Info:");
        electricBike.displayInfo();

        System.out.println("\nElectric Car Info:");
        electricCarCar.displayInfo();
    }
}
