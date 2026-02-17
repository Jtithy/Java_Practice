
import java.util.Scanner;

public class Recursion {

    //Method 1
    static int factorial(int n) {
        // fsctorial (n) = n*n-1*...*1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //Method 2
    static int iterativeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
            int iterativeResult = iterativeFactorial(num);
            System.out.println("Iterative factorial of " + num + " is: " + iterativeResult);
        }
    }
}
