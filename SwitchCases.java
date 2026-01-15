
import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int day = input.nextInt();
            switch (day) {
                case 1 -> System.out.println("Saturday");
                case 2 -> System.out.println("Sunday");
                case 3 -> System.out.println("Monday");
                case 4 -> System.out.println("Tuesday");
                case 5 -> System.out.println("Wednesday");
                case 6 -> System.out.println("Thursday");
                case 7 -> System.out.println("Friday");
                default -> System.out.println("Invalid Day");
            }
        }
    }
}