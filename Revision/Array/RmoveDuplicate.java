package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class RmoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array={1,2,3,3,4,4,5,6};
        int j=0;
        for(int i=1;i<array.length;i++){
            // for(int j=1;j<array.length;j++){
                if(array[i]!=array[j]){
                    j++;
                    array[j]=array[i];
                }
            // }
        }
        System.out.println("After removing : ");
        for(int i=0;i<=j;i++){
            System.out.print(array[i]+" ");
        }
    }
}
