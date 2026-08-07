package JavaQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse =0;
        int original=n;
        while(n>0){
            int digit=n%10;
            n=n/10;
            reverse = reverse * 10 + digit;
        }
        if(original == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
