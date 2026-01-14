
//Java program to convert Kilometers top Miles taking user input.
import java.util.Scanner;

public class KiloToMiles {

    public static void main(String[] args) {
        System.out.println("Enter Kilometers:");
        try (Scanner input = new Scanner(System.in)) {
            int kilometers = input.nextInt();
            float miles = kilometers * 0.62f;
            System.out.println(miles);
        }
    }
}
