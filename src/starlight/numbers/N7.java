package starlight.numbers;

import java.util.Scanner;

public class N7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int palindrom;
        int temp;

        do {
            palindrom = 0;
            temp = number;

            while (temp > 0) {
                palindrom = palindrom * 10 + temp % 10;
                temp = temp / 10;
            }

            if (number == palindrom) {
                System.out.println( number + " is the biggest palindrome smaller than the number you entered.");
                break;
            }
            else {
                number--;
            }
        }
        while (true);
    }
}
