
package JavaQuestions.Array;

import java.util.Scanner;

public class SwapRows {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Swap first row and last row
        int[] temp = array[0];
        array[0] = array[rows - 1];
        array[rows - 1] = temp;

        // Print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

