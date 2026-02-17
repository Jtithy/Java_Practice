//Write a program to calculate (recursion must be used) fibonacci series in Java 1

import java.util.Scanner;

public class Cal_Fibonacci {

    // Recursive function to calculate nth Fibonacci
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();

            System.out.print("Fibonacci series up to " + num + ": ");

            for (int i = 0; i < num; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
}
