package JavaQuestions.Array;

import java.util.Scanner;

public class FoundORNot {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int col=sc.nextInt();
    int[][] array=new int[rows][col];
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            array[i][j]=sc.nextInt();
        }}
    int target=sc.nextInt();
    boolean found=false;
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            if(array[i][j] == target){
                found=true;
            }
        }
    }
    if (found) {
        System.out.println("Element Found");
    }
    else{
        System.out.println("Element Not found");
    }
} }
