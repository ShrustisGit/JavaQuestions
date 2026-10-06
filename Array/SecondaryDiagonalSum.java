package JavaQuestions.Array;

import java.util.Scanner;

public class SecondaryDiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i + j == rows - 1) {
                    sum = sum + array[i][j];
                }
            }
        }

        System.out.println("Secondary diagonal sum = " + sum);
    }
}