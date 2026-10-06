package JavaQuestions.Array;

import java.util.Scanner;

public class LargestFromLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[rows][col];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<col;j++){
            int max=0;
            for(int i=0;i<rows;i++){
                if(array[i][j]>max){
                    max=array[i][j];
                }
                
            }
            System.out.println("Row"+" "+(j+1)+"-"+" "+max);
        }
        
       
    }
}
