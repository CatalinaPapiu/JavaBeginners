package challenge3;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter an integer value for y: ");
        int y = scanner.nextInt();

        if (x < y) {
            System.out.println(x + " is smaller than " + y + " and the difference between x and y is: " + (y-x) );
        }
        else if (x > y) {
            System.out.println(x + " is bigger than " + y + " and the difference between x and y is: " + (x-y) );
        }
        else {
            System.out.println(x + " and " + y + " are the same, therefore the difference between x and y is 0.");
        }
    }
}
