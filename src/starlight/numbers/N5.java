package starlight.numbers;

import java.util.Scanner;

public class N5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if ((isPrime) && (number !=1)) {
            System.out.println("Your number is prime.");
        }
        else {
            System.out.println("Your number is not prime.");
        }
    }
}
