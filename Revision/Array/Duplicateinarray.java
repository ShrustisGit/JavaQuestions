package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class Duplicateinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("duplicate Values Are : ");
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    System.out.print(array[i]+" ");
                    break;
                }
            }
            
        }
    }
}
