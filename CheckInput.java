
import java.util.Scanner;

public class CheckInput {

    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        try (Scanner sc = new Scanner(System.in)) {
            boolean b1 = sc.hasNext();
            System.out.print(b1);
        }
    }
}
