
import java.util.Scanner;

public class LineInput {

    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.print(str);
        }
    }
}
