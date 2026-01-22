/* Write a Java program to find out the day of the week given the number [ 1 for Monday,
2 for Tuesday ... and so on ! 7
 */

import java.util.Scanner;

public class FindDay {

    public static void main(String[] args) {
        int day;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the day number (1 for Monday, 7 for Sunday): ");
            day = input.nextInt();
        }

        switch (day) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Error.");
                break;
        }
    }
}
