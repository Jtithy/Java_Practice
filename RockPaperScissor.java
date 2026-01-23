// Make a Rock Paper Scissor game

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        int choiceA;
        int choiceB;

        System.out.println("Choices:\n1. Rock\n2. Paper\n3. Scissor");

        try (Scanner input = new Scanner(System.in)) {

            // 1st Choice
            System.out.print("Enter your choice one (1, 2, 3): ");
            choiceA = input.nextInt();

            if (choiceA < 1 || choiceA > 3) {
                System.out.println("Invalid choice.");
                return;
            }

            // 2nd Choice
            System.out.print("Enter your choice two (1, 2, 3): ");
            choiceB = input.nextInt();

            if (choiceB < 1 || choiceB > 3) {
                System.out.println("Invalid choice.");
                return;
            }
        }

        // Example game logic
        if (choiceA == 1 && choiceB == 2) {
            System.out.println("Player B wins! Paper covers Rock.");
        } else if (choiceA == 1 && choiceB == 3) {
            System.out.println("Player A wins! Rock can brake the Scissor.");
        } else if (choiceA == 2 && choiceB == 3) {
            System.out.println("Player B wins! Scissor can cut the Paper.");
        } else if (choiceA == 2 && choiceB == 1) {
            System.out.println("Player A wins! Paper covers Rock.");
        } else if (choiceA == 3 && choiceB == 1) {
            System.out.println("Player B wins! Rock can brake the Scissor.");
        } else {
            System.out.println("Player A wins! Scissor can cut the Paper.");
        }

        System.out.println("Thank you for using our system.");
    }
}
