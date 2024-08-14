package com.calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {

    public void calculate(){

        String number1 = null;
        String number2 = null;

        Scanner scanner = new Scanner(System.in);
        while(true){
            displayMenu();
            int choice = scanner.nextInt();
            if (choice == 5){
                System.out.println("You are done ..!!");
                break;
            }

            System.out.println("Enter number1");
            number1 =  scanner.next();
            BigInteger num1 = new BigInteger(number1);

            System.out.println("Enter number2");
            number2 = scanner.next();
            BigInteger num2 = new BigInteger(number2);

            switch (choice){
                case 1 -> {
                    System.out.println("Result : "+num1.add(num2));
                }
                case 2 ->{
                    System.out.println("Result : "+num1.subtract(num2));
                }
                case 3 -> {
                    System.out.println("Result : "+num1.multiply(num2));
                }
                case 4 ->{
                    if (num2.equals(new BigInteger("0")) ){
                        System.out.println("Cannot divide by zero");
                    }
                    else {
                        System.out.println("Result : "+num1.divide(num2));
                    }
                }
                default -> {
                    System.out.println("Pick an option from ( 1 - 4 )");
                }
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("-----------------------------");
        System.out.println("Pick a option to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. End");
    }

}
