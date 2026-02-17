
import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {
        // fsctorial (n) = n*n-1*...*1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
