
import java.util.Scanner;

public class InputArrays {

    public static void main(String[] args) {
        int n;
        int[] arr;
        System.out.println("Enter array size: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();

            // Initialized array size
            arr = new int[n];
            System.out.println("Enter arr values: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
