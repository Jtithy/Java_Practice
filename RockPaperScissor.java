// Make a Rock Paper Scissor game

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        int choiceA = 0;
        int choiceB = 0;
        System.out.println("Choices: \n 1.Rock \n 2. Paper \n 3. Scissor");
        try (Scanner input = new Scanner(System.in)) {
            // 1st Choice
            System.out.println("Enter your choice one(1, 2, 3): ");
            if (choiceA >= 1 && choiceA <= 3) {
                choiceA = input.nextInt();
            } else {
                System.out.println("Invalid choice.");
            }

            // 2nd Choice
            System.out.println("Enter your choice two(1, 2, 3): ");
            if (choiceB >= 1 && choiceB <= 3) {
                choiceB = input.nextInt();
            } else {
                System.out.println("Invalid choice.");
            }
        }
        if (choiceA == 1 && choiceB == 2) {

        }
    }
}
