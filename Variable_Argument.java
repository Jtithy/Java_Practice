
public class Variable_Argument {

    /* static int sum(int a, int b) {
        return a + b;
    }
     */
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Variable Argument.");
        System.out.println("Sum of a and b: " + sum(50, 40));
        System.out.println("Sum of a, b and c: " + sum(50, 40, 30));
        System.out.println("Sum of a, b, c and d: " + sum(50, 40, 30, 20));
    }
}
