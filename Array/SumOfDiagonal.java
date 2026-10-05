package JavaQuestions.Array;

import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int sum=0;
        int[][] array=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j =0;j<cols;j++){
                array[i][j]=sc.nextInt();

            }
        }
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                if(i==j){
                    sum=sum+array[i][j];
                }
            }
            
        }
        System.out.println(sum);
    }
}
