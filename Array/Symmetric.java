package JavaQuestions.Array;

import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] array = new int[rows][col];

        boolean symmetric=true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

       
       if( rows != col){
        symmetric=false;
       }else{
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                if(array[i][j]!=array[j][i]){
                    symmetric=false;
                }
            }
        }
        }
        if(symmetric){
            System.out.println("Symmetric ");
        }
        else{
            System.out.println("Not Symmetric");
        }

        
    }
}