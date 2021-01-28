package challenge3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter an integer value for y: ");
        int y = scanner.nextInt();

        if (x < y) {
            System.out.println(x + " is smaller than " + y);
        } else if (x > y) {
            System.out.println(x + " is bigger than " + y);
        } else {
            System.out.println(x + " and " + y + " are the same.");
        }
    }
}
