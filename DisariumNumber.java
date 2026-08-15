package JavaQuestions;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int digits = 0;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        int position = digits;

        // Calculate sum of digits raised to their positions
        while (n > 0) {

            int digit = n % 10;

            sum = sum + (int) Math.pow(digit, position);

            n = n / 10;
            position--;
        }

        if (sum == original) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }

        sc.close();
    }
}