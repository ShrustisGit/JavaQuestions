package JavaQuestions.Array;

import java.util.Scanner;

public class LargestDiffinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int small=9;
        int large=-1;
        for(int i =0;i<n;i++){
            if(array[i]<small){
                small = array[i];
            }
            else if(array[i]>large){
                large=array[i];
            }
        }
        System.out.println("Smallest value is : "+small );
        System.out.println("Largest value is : "+large);
        int diff=large-small;
        System.out.println("Difference is : "+diff);
    }
}
