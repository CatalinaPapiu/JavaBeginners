package bonus;

import java.util.Scanner;

public class ArrayInclusion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isIncluded = false;

        System.out.println("Enter the length of the first array: ");
        int firstLength = scanner.nextInt();
        int[] firstArray = new int[firstLength];

        for (int i=0; i<firstLength; i++) {
            System.out.println("Enter value: ");
            firstArray[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Enter the length of the second array: ");
        int secondLength = scanner.nextInt();
        int[] secondArray = new int[secondLength];

        for (int i=0; i<secondLength; i++) {
            System.out.println("Enter value: ");
            secondArray[i] = scanner.nextInt();
        }

        for (int i=0; i<secondLength; i++) {
            if (secondArray[i] == firstArray[0]) {
                isIncluded = true;
                for (int j=1; j<firstLength; j++) {
                    if (firstArray[j] != secondArray[i+j]) {
                        isIncluded = false;
                        break;
                    }
                }
                if (isIncluded) {
                    System.out.println();
                    System.out.println("The first string is included in the second string!");
                    break;
                }
            }
        }

        if (!isIncluded) {
            System.out.println();
            System.out.println("The first string is not included in the second string!");
        }
    }
}
