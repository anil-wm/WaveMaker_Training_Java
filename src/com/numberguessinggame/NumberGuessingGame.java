package com.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public void guessNumber(){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(1000);

        while(true){
            System.out.println("Guess the Number");
            int userInput = scanner.nextInt();

            if (userInput == randomNumber){
                System.out.println("You guessed it ..!!");
                break;
            }
            else if(userInput > randomNumber){
                System.out.println("Number is HIGH");
                System.out.println("Try again...");
            }
            else {
                System.out.println("Number is LOW");
                System.out.println("Try again...");
            }
        }
        scanner.close();
    }

}
