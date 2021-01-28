package starlight.numbers;

import java.util.Scanner;

public class N1N2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int obtainedNumber = scanner.nextInt();
        int number;

        while (obtainedNumber > 9) {
            number = obtainedNumber;
            int sum = 0;

            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }

            System.out.println("The sum of " + obtainedNumber + "'s digits is: " + sum);
            obtainedNumber = obtainedNumber/10;
        }
    }
}
