package JavaQuestions.Array;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] array = new int[rows][col];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        boolean identity = true;

        // Check identity matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                if (i == j) {
                    if (array[i][j] != 1) {
                        identity = false;
                    }
                } else {
                    if (array[i][j] != 0) {
                        identity = false;
                    }
                }
            }
        }

        if (identity) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }
}