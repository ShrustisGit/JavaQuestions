package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class indexesofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array={1,2,3,4,5};
        int target=4;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("Index Of "+target+" : "+i);
            }
        }
    }
}
