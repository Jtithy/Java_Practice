
import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        try (Scanner value = new Scanner(System.in)) {
            int age = value.nextInt();
            if (age > 18) {
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You are not eligible to drive.");
            }
        }

    }
}
