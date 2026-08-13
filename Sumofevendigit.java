package JavaQuestions;

import java.util.Scanner;

public class Sumofevendigit {
    public static void main(String[] args) {
        System.out.println("Sum of even digit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            if(digit % 2 == 0){
                sum += digit;
            }

        }
        System.out.println(sum);
    }
}
