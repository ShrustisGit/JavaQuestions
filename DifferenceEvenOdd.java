package JavaQuestions;

import java.util.Scanner;

public class DifferenceEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }

            n = n / 10;
        }

        int difference = evenSum - oddSum;

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
        System.out.println("Difference: " + difference);

        sc.close();
    }
}