package JavaQuestions;

import java.util.Scanner;

public class Multiplydigits {
    public static void main(String[] args) {
        System.out.println("Multiply Digit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        while (n>0) {
            int digit=n%10;
            mul=mul*digit;
            n=n/10;
        }
        System.out.println(mul);
    }
}
