
public class Even_Numbers {

    public static void main(String[] args) {
        System.out.println("Printing even numbers:");
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
