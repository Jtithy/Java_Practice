
//Check number is integer or not in Java
import java.util.Scanner;

public class IntegerOrNot {

    public static void main(String[] args) {
        System.out.println("Enter integer:");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(input.hasNextInt());
        }
    }
}
