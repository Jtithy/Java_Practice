
import java.util.Scanner;

public class Methods {

    static void tellJoke() {
        System.out.println("I invented a new word! Plagiarism!");
    }

    static void change(int[] arr) {
        arr[0] = 100;
    }

    static int logic1(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        System.out.println("Enter the values: ");
        int a;
        int b;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        int c;
        c = logic1(a, b);
        System.out.println(c);
        int[] marks = {52, 73, 88, 91, 64};
        change(marks);
        //Reference is passed in change method
        System.out.println("After changing: " + marks[0]);
        tellJoke();
    }
}
