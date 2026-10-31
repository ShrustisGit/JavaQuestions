package JavaQuestions.Array;

import java.util.Scanner;

public class OccerenceArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array={1,2,3,4,4,4,4,6,4};
        int tar=sc.nextInt();
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==tar){
                count++;
            }
        }
        System.out.println("Occurunce of target "+tar+" is - " +count);

    }
}
