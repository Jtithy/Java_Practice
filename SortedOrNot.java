// Write a Java program to find whether an array is sorted or not.

import java.util.Scanner;

public class SortedOrNot {

    public static void main(String[] args) {
        int n;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Eneter size: ");
            n = sc.nextInt();

            //Initialized the array size
            arr = new int[n];
            System.out.println("Enter elemenyts: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Printing the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Checking Sorted or not
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        System.out.println("\nChecking if array is sorted...");

        if (ascending) {
            System.out.println("Array is sorted in ASCENDING order.");
        } else if (descending) {
            System.out.println("Array is sorted in DESCENDING order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
