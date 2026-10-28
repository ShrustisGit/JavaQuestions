package JavaQuestions.Array;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(array[i] == array[j]){
                System.out.print(array[i]+" ");
                break;
                }
            }
        }

}
 }