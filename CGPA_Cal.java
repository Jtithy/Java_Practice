
//Count SGPA in Java
import java.util.Scanner;

public class CGPA_Cal {

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers(1 t0 100):");
        try (Scanner input = new Scanner(System.in)) {
            float s1 = input.nextFloat();
            float s2 = input.nextFloat();
            float s3 = input.nextFloat();
            float s4 = input.nextFloat();
            float s5 = input.nextFloat();
            System.out.println("Enter 5 credits(1 to 3):");
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            int c5 = input.nextInt();
            float sum = (s1 * c1) + (s2 * c2) + (s3 * c3) + (s4 * c4) + (s5 * c5);
            float sgpa = sum / 100;
            System.out.println(sgpa);
        }
    }
}
