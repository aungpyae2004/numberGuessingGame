package com.silent;

import java.util.Random;
import java.util.Scanner;

public class XConsole implements Console {
    private int number;

    @Override
    public void printRequireInfo() {
        System.out.println("____________________");
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("____________________");
        System.out.println("How to play:");
        System.out.println("Guess number between 1 and 10. You have to guess the number that we generate. You have three chances to get the right answer. Good luck, gentleman.");
        System.out.println("");
    }

    @Override
    public void CheckAnswer() {
        byte guessingTime = 0;
        byte guessingTrial = 3;

        var random = new Random();
        int generateNumber = random.nextInt(10) + 1;

        var scanner = new Scanner(System.in);
        while (guessingTime < guessingTrial) {
            System.out.print("Guess: ");
            number = scanner.nextInt();

            if (number == generateNumber) {
                System.out.println("You won");
                break;
            } else if (number < generateNumber) {
                System.out.println("Guess number is smaller than generate number.");
                guessingTime++;
            } else if (number > generateNumber) {
                System.out.println("Guess number is greater than generate number.");
                guessingTime++;
            }
        }
        System.out.println("GameOver");
        if (number > 10) {
            throw new IllegalArgumentException("Guess number between 1 and 1000. If you do that again, I will hack your device and I will destroy your life.");
        }
    }
}
