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
        int smallest=9;
        int largest=-1;
        for(int i=0;i<n;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
            else if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("Smallest:"+ " "+smallest);
        System.out.println("Largest:"+" "+largest );
        int diff=largest-smallest;
        System.out.println("Difference is :"+" " +diff);
    }
}
