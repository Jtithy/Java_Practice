
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println("Enter marks values: ");
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                marks[i] = input.nextInt();
            }
        }
        System.out.println("The marks are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + marks[i]);
        }
    }
}
