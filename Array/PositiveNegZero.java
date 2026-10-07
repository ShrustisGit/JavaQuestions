package JavaQuestions.Array;

import java.util.Scanner;

public class PositiveNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[row][col];
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]>0){
                    pos++;
                }
                else if(array[i][j]<0){
                    neg++;
                }
                else if(array[i][j]==0){
                    zero++;
                }
            }
        }
        System.out.println("Positive ="+" "+pos);
        System.out.println("negative ="+" "+neg);
        System.out.println("Zero ="+" "+zero);
    }
}
