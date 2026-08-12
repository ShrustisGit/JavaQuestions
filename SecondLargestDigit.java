package JavaQuestions;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {

            int digit = n % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            n = n / 10;
        }

        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}