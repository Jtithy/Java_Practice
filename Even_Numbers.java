
public class Even_Numbers {

    public static void main(String[] args) {
        System.out.println("Printing even numbers in decreament order:");
        int i = 50;
        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
