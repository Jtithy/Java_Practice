
public class ArrayDisplay {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //Displaying array (Naive Way)
        System.out.println("Displayinh array in naive way: ");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        //Displaying array (Looping Way)
        System.out.println("Displaying array through looping: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Sidplaying array using for-each loop
        System.out.println("Displaying array through for-each loop: ");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
