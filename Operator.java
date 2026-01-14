
public class Operator {

    public static void main(String[] args) {
        int a = 4;
        a += 2;
        int b = 6 + a;
        int c = 10 - a;
        int d = c * a;
        int e = b / a;
        a -= 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(9 == 8);
        System.out.println(9 != 8);
        System.out.println(65 > 4 && 4 < 64);
        System.out.println(65 > 4 && 4 > 64);
    }
}
