
public class Break_Continue {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Cut the loop using continue.");
                continue;
            }
            System.out.println(i);
            if (i == 7) {
                System.out.println("Ending the loop using break.");
                break;
            }
        }
    }
}
