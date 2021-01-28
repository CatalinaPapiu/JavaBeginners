package starlight.numbers;

import java.util.Scanner;

public class N9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month: ");
        int month = scanner.nextInt();

        System.out.println("Enter the day: ");
        int day = scanner.nextInt();

        switch (month) {
            case 1:
                findWeekDay(day,2,31);
                break;
            case 2:
                findWeekDay(day,5,29);
                break;
            case 3:
                findWeekDay(day,6,31);
                break;
            case 4:
                findWeekDay(day,2,30);
                break;
            case 5:
                findWeekDay(day,4,31);
                break;
            case 6:
                findWeekDay(day,0,30);
                break;
            case 7:
                findWeekDay(day,2,31);
                break;
            case 8:
                findWeekDay(day,5,31);
                break;
            case 9:
                findWeekDay(day,1,30);
                break;
            case 10:
                findWeekDay(day,3,31);
                break;
            case 11:
                findWeekDay(day,6,30);
                break;
            case 12:
                findWeekDay(day,1,31);
                break;
            default:
                System.out.println("Not a valid month");
                break;
        }
    }

    public static void findWeekDay(int day, int index, int totalDays) {
        if (day > 0 && day <= totalDays) {
            switch ((day + index) % 7) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
                    break;
            }
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
