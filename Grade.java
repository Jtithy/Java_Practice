//Write a java program to encrypt a grade by adding 8 and decode it.

public class Grade {

    public static void main(String[] args) {
        char score = 'B';
        // Encrypt the grade
        score = (char) (score + 8);
        //
        score = (char) (score - 8);
        System.out.println("Score:" + score);
    }

}
