// Write a lava program to find whether a year entered by the user is a leap year or not.

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        int year;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter year: ");
            year = sc.nextInt();
        }
        if (year % 4 == 0) {
            System.out.println("It's leap year.");
        } else {
            System.out.println("It's not leap year.");
        }
    }
}
