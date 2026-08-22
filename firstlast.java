package JavaQuestions;

import java.util.Scanner;

public class firstlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int firstDigit=n;
        int lastDigit=n % 10;
       
        while (firstDigit >= 10){
            firstDigit = firstDigit / 10;
        }
        System.out.println("First Digit is = " +firstDigit);
        System.out.println("Last Digit is = " +lastDigit);

        sc.close();

    }
}
