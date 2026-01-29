// Calculate the average marks from an array containing marks of all students in Physics using for- each loop.

import java.util.Scanner;

public class ArrayAverageCal {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter elements: ");
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextInt();
            }
        }
        System.out.println("Printing all elements: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Counting average from the array: ");
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        float avg = sum / 5;
        System.out.println("The average is: " + avg);
    }
}
