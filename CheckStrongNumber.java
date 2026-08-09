package JavaQuestions;
import java.util.Scanner;

public class CheckStrongNumber {
    public static void main(String[] args) {
        System.out.println("if factorial is 145 and sum of factorail is 145 is strong number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            // Find factorial of digit
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            n = n / 10;
        }

        if (original == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }

        sc.close();
    }
}