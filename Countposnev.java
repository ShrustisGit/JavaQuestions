package JavaQuestions;

import java.util.Scanner;

public class Countposnev {
    public static void main(String[] args) {
       System.out.println("Count Positive negative number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive"+" "+ pos);
        System.out.println("Vegative"+" "+ neg);
        System.out.println("Zero"+" "+ zero);
    }
}
