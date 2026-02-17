
import java.util.Scanner;

public class Methods {

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
    }
}
