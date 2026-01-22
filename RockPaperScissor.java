// Make a Rock Paper Scissor game

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        String choice;
        try (Scanner write = new Scanner(System.in)) {
            System.out.println("Enter your choice(Rock. Paper or Scissor): ");
            choice = write.nextLine();
        }

    }
}
