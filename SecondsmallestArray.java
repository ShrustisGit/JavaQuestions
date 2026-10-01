package JavaQuestions;

import java.util.Scanner;

public class SecondsmallestArray {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i= 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=9;
        int secondsmallest=9;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i] != smallest){
                secondsmallest=arr[i];
            }
        }
        System.out.println("Smallest is"+" "+smallest);
        System.out.println("Second smallest "+" "+secondsmallest);
    }
}
