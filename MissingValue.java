package JavaQuestions;

import java.util.Scanner;

public class MissingValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        int sum2=0;
        for(int i=0;i<=n;i++){
            sum2=sum2+i;
        }
        System.out.println(sum2);
        int missing=sum2-sum;
        System.out.println("Missing Vlaue is"+" "+missing);
    }
}
