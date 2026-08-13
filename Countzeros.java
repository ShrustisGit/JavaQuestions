package JavaQuestions;

import java.util.Scanner;

public class Countzeros {
    public static void main(String[] args) {
        System.out.println("Countzero");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            if(digit == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
