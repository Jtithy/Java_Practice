
import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number to find factorial: ");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
        }
        System.out.println("Factorial of the number " + n);
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
