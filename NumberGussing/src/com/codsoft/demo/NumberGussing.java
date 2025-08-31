package com.codsoft.demo;

import java.util.Random;
import java.util.Scanner;

public class NumberGussing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        int totalScore = 0;   // total score across games
        int roundsWon = 0;    // count how many rounds user won

        do {
            int randomNumber = random.nextInt(100);
            int count = 1;
            boolean guessedCorrectly = false;

            System.out.println("\nWelcome to Number Guessing Game!");
            System.out.println("You have 5 chances to guess the number between 0 and 99.");

            while (count <= 5) {
            	System.out.println(randomNumber);
                System.out.print("Attempt " + count + " - Guess the Number: ");
                int enteredNumber = sc.nextInt();
                

                if (enteredNumber == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;

                  
                    int points = 6 - count;
                    totalScore += points;
                    roundsWon++;

                    System.out.println("You earned " + points + " points this round!");
                    break;
                } else if (enteredNumber > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
                count++;
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! The correct number was: " + randomNumber);
            }

            System.out.println("\nCurrent Stats:");
            System.out.println("   Rounds Won: " + roundsWon);
            System.out.println("   Total Score: " + totalScore);

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("\nFinal Stats:");
        System.out.println("   Total Rounds Won: " + roundsWon);
        System.out.println("   Final Score: " + totalScore);
        System.out.println("Thanks for playing! Goodbye.");
        
        sc.close();
    }
}
