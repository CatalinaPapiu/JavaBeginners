package bonus;

import java.util.Scanner;

public class RecursiveSmallestCommonDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(smallestDiv(firstNumber, secondNumber));
    }

    private static int smallestDiv(int firstNr, int secondNr) {
        if (firstNr == secondNr) {
            return firstNr;
        }
        else {
            return (firstNr < secondNr ? smallestDiv(firstNr, secondNr - firstNr) : smallestDiv(firstNr-secondNr, secondNr));
        }
    }
}
