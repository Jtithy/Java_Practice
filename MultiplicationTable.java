
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number for multiplication table: ");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
        }
        System.out.println("The multiplication table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
