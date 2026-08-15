package JavaQuestions;

import java.util.Scanner;

public class SecondSmallestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int smallest = 9;
        int secondSmallest = 9;

        while (n > 0) {

            int digit = n % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }

            n = n / 10;
        }

        System.out.println("Second Smallest Digit: " + secondSmallest);

        sc.close();
    }
}