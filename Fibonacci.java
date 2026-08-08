package JavaQuestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int num=0;num<=n;num++){
            System.out.println(a);
            int next = a+b;
            a=b;
            b=next;
            
        }
    }
}
