
//Create a program for counting average of 5 subjects' marks taking user input
import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        System.out.println("Taking inout:");
        try (Scanner sc = new Scanner(System.in)) {
            float sub1 = sc.nextFloat();
            float sub2 = sc.nextFloat();
            float sub3 = sc.nextFloat();
            float sub4 = sc.nextFloat();
            float sub5 = sc.nextFloat();
            float sum = sub1 + sub2 + sub3 + sub4 + sub5;
            float average = sum / 5;
            System.out.println(average);
        }
    }
}
