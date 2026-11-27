package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n-1];
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];

        }
        System.out.println("Sum of Array : "+sum);
        int missing=n*(n+1)/2;
        int missingval=missing-sum;
        System.out.println("Missing is : "+missingval);
    }
}
