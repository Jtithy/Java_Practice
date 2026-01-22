/* Calculate income for paid by an employee to the government as per the slabs mentioned below:
Tax   Income Stab
5%     2.51 - 5.01
20%    5.01-10.01
30%    Above 10.01
Note that there is no tax below 2.5Lakh. Take input amount as an input from the user.
 */

import java.util.Scanner;

public class Calculate_IncomeTax {

    public static void main(String[] args) {
        float tax = 0.0f;
        float income;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your income (in Lakh): ");
            income = input.nextFloat();
        }

        if (income <= 2.5f) {
            tax = 0.0f;
        } else if (income > 2.5f && income <= 5.0f) {
            tax = income * 5 / 100f;
        } else if (income > 5.0f && income <= 10.0f) {
            tax = income * 20 / 100f;
        } else {
            tax = income * 30 / 100f;
        }

        System.out.println("Your tax: " + tax + " Lakh");
    }
}
