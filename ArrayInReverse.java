// Write a program to print array in reverse.

import java.util.Scanner;

public class ArrayInReverse {

    public static void main(String[] args) {
        int n;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size: ");
            n = sc.nextInt();

            //Array size decleration
            arr = new int[n];

            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("Printing array in reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
