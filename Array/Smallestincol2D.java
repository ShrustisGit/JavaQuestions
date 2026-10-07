package JavaQuestions.Array;

import java.util.Scanner;

public class Smallestincol2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<cols;j++){
            int smallest=9;
            for(int i=0;i<rows;i++){
                if(array[i][j]<smallest){
                    smallest=array[i][j];
                }
            }
            System.out.println("Smallest in col"+(j+1)+"="+" "+smallest);
        }
    }
}
