package starlight.numbers;

import java.util.Scanner;

public class N6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int palindrom = 0;
        int temp = number;

        while (temp > 0) {
            palindrom = palindrom * 10 + temp % 10;
            temp = temp / 10;
        }

        if (number == palindrom) {
            System.out.println("This number is a palindrom.");
        }
        else {
            System.out.println("This number is not a palindrom.");
        }
    }
}
