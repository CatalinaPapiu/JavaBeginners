package challenge3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        System.out.println();
        System.out.print("Enter your guess from 1 to 5: ");
        int luckyGuess = scanner.nextInt();

        if ((luckyGuess >= 1) && (luckyGuess <=5)) {
            if (luckyGuess == randomNumber) {
                System.out.println("Correct! Aren’t you lucky. The number is: " + randomNumber);
            }
            else {
                System.out.println("Hard luck! Maybe next time. The number is: " + randomNumber);
            }
        }
        else {
            System.out.println("Your guess is invalid.");
        }
    }
}
