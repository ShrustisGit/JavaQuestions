package JavaQuestions.Revision;

import java.util.Scanner;

public class Harshandnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        System.out.println("Sum of Digit is : "+sum);
        if(n%sum==0){
            System.out.println("Harshand Number");

        }
        else{
            System.out.println("Not Harshand Number");
        }
    }
}
