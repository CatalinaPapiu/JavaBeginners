package starlight.numbers;

import java.util.Scanner;

public class N3N4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        int product = firstNumber * secondNumber;

        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            }
            else {
                secondNumber = secondNumber - firstNumber;
            }
        }

        System.out.println("The highest common divisor of these 2 numbers is: " + firstNumber);
        System.out.println("The smallest common multiple of these 2 numbers is: " + product/firstNumber);

    }
}
