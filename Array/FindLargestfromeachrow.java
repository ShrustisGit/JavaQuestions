package JavaQuestions.Array;

import java.util.Scanner;

public class FindLargestfromeachrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int largest=-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]>largest){
                    largest=array[i][j];
                }
            }
        }
        System.out.println("Largets : "+largest);
    }   
}

