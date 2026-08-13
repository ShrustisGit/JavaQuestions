package JavaQuestions;

import java.util.Scanner;

public class SumProperDivisors {
    public static void main(String[] args) {
        System.out.println("Sum Proper Divisors");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of proper divisors = " + sum);

        sc.close();
    }
}