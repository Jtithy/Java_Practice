// Create a Java program to add two matrices of Size 2×3.

public class AddMatrices {

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] mat2 = {
            {3, 4, 5},
            {4, 5, 6}
        };
        int[][] result = {
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Adding two matrices: ");
        for (int i = 0; i < mat1.length; i++) { //row
            for (int j = 0; j < mat1[i].length; j++) { //column
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Printing the resultent matrix: ");
        for (int i = 0; i < mat1.length; i++) { //row
            for (int j = 0; j < mat1[i].length; j++) { //column
                System.out.print(result[i][j] + " ");
            }
            System.err.println();
        }
    }
}
