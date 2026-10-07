package JavaQuestions.Array;

import java.util.Scanner;

public class boundaryelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                array[i][j]=sc.nextInt();
            }}
        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                if(i ==0 || i == rows-1 || j == 0 || j== col-1 ){
                    System.out.print(array[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
























