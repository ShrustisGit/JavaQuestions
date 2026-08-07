package JavaQuestions;

import java.util.Scanner;

public class CountNumOfDigit {
    public static void main(String[] args) {
        System.out.println("Counting number of Digits");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            int num=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
