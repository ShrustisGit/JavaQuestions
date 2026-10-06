package JavaQuestions.Array;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int max=-1;
        int maxcol=0;

        int[][] array=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }

        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum=sum+array[i][j];
            }
            System.out.println("Row"+" "+(j+1)+"-"+sum);
            if(sum>max){
                max=sum;
                maxcol=j+1;

            }

        }
        System.out.println("MAx sum of col"+max);
        System.out.println("col number"+maxcol);
      

    }
}
