package JavaQuestions.Array;

import java.util.Scanner;

public class Smallestin2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        int smallest=9;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(array[i][j]<smallest){
                    smallest=array[i][j];
                }
            }}
        System.out.println("Smallest is "+" "+smallest);
    }
}
