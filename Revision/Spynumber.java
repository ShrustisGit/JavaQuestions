package JavaQuestions.Revision;

import java.util.Scanner;

public class Spynumber {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
            mul=mul*digit;

        }
        System.out.println("Sum is : "+sum);
        System.out.println("Multiply is : "+mul);
        if(sum == mul){
            System.out.println("Number is Spy");

        }
        else{
            System.out.println("Number is not Spy");
        }
    }
}
