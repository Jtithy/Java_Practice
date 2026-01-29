//Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class PresentOrNot {

    public static void main(String[] args) {
        int[] arr = {23, 453, 65, 12, 768};
        System.out.println("Enter target elements: ");
        try (Scanner input = new Scanner(System.in)) {
            int target = input.nextInt();
            System.out.println("Finding the element: ");
            for (int i = 0; i < 5; i++) {
                if (arr[i] == target) {
                    System.out.print("Targeted element has been found at indext " + i);
                    break;
                }
            }
        }
    }
}
