// Create an array of 5 floats and calculate the sum

import java.util.Scanner;

public class ArrayCalculation {

    public static void main(String[] args) {
        float[] arr = new float[5];
        float sum = 0;
        System.out.println("Enter array elements: ");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextFloat();
            }
        }
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the elements: " + sum);
    }
}
