package JavaQuestions.Array;

import java.util.Scanner;

public class Occurncein2D {
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
    int target=sc.nextInt();
    int count=0;
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            if(array[i][j] == target){
                count++;
            }
        }
    }
    
        System.out.println("Count of "+target+"-"+count);
    
} }
