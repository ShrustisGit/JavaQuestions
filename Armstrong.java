package JavaQuestions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original =n;
        int sum=0;
        while (n>0) {
            int digit=n%10;
            int cube=digit *digit*digit;
            sum = sum + cube;
            n=n/10;
        }
        if(original == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }
}
