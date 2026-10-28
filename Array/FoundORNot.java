package JavaQuestions.Array;

import java.util.Scanner;

public class FoundORNot {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows=3;
    int cols=3;
    int[][] array=new int[rows][cols];
    int target=9;
    boolean found=false;
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            array[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(array[i][j] == target){
                found=true;
                break;
            }
        }
    }
    if(found){
        System.out.println("Element Found");
    }
    else{
        System.out.println("Element not Found");
    }
    }
} 
