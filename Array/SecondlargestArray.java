package JavaQuestions.Array;

import java.util.Scanner;

public class SecondlargestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=-1;
        int secondlargest=-1;
        for(int i =0 ;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i] != largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Largest is "+" "+ largest);
        System.out.println("Second largest is "+" "+ secondlargest);
    }
}
