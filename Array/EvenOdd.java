package JavaQuestions.Array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[rows][col];
        int even=0;
        int odd=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(array[i][j] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("Even -"+" "+ even);
        System.out.println("Odd -"+" "+odd);
    }
}
