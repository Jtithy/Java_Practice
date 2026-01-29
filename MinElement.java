//Write a Java program to find the minimum element in an array.

import java.util.Scanner;

public class MinElement {

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
        int min = arr[0];
        //Finding the min element
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The min element is: " + min);
    }
}
