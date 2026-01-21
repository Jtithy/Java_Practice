/* Write a program to find out whether a student is pass or fail; if it requires total 40%
and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.
 */

import java.util.Scanner;

public class FailOrPass {

    public static void main(String[] args) {
        float m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics:");
        m1 = sc.nextFloat();
        System.out.println("Enter your marks in Chemistry:");
        m2 = sc.nextFloat();
        System.out.println("Enter your marks in Mathematics:");
        m3 = sc.nextFloat();
        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulation. You're passed");
        } else {
            System.out.println("Sorry. Try again.");
        }
    }
}
