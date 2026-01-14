
//Use comparisom operator to check whether the entered number is higher than 100 or not.
import java.util.Scanner;

public class HigherNumber {

    public static void main(String[] args) {
        int a = 100;
        System.out.println("Enter a number to compare with 100: ");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num > a) {
                System.out.println("Entered number is higher.");
            } else {
                System.out.print("Entered number isn't higher.");
            }
        }
    }
}
