
public class PrintPattern {

    public static void main(String[] args) {
        int i;
        for (i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
