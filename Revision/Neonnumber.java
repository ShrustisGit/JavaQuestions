package JavaQuestions.Revision;

import java.util.Scanner;

public class Neonnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int temp=sq;
        int sum=0;
        while (temp>0) {
            int digit=temp%10;
            temp=temp/10;
            sum=sum+digit;
        }
        if(n == sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}
