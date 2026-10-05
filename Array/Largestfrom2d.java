package JavaQuestions.Array;

import java.util.Scanner;

public class Largestfrom2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[rows][col];
        int largest=-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]>largest){
                    largest=array[i][j];
                }
            }
        }
        System.out.println(largest);


    }
}
