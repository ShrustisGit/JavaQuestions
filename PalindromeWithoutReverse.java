package JavaQuestions;

import java.util.Scanner;

public class PalindromeWithoutReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int divisor = 1;

        // Find divisor based on number of digits
        while (temp >= 10) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        boolean palindrome = true;

        while (n > 0) {

            // Get first digit
            int first = n / divisor;

            // Get last digit
            int last = n % 10;

            // Compare first and last digit
            if (first != last) {
                palindrome = false;
                break;
            }

            // Remove first digit
            n = n % divisor;

            // Remove last digit
            n = n / 10;

            // Move divisor two places left
            divisor = divisor / 100;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}