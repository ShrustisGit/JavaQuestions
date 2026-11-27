package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class SumPair {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array={1,2,3,4,5,6,7,8};
    int target=7;
    boolean found=false;
    for(int i=0;i<array.length;i++){
        for(int j=1;j<array.length;j++){
            if(array[i] + array[j] == target){
                System.out.println(array[i] +" "+ array[j]);
                found=true;
            }
        }
    }
    if(!found){
        System.out.println("Pair not found");
    }
}
 }