package JavaQuestions;
import java.util.Scanner;

public class Greatescommondivide {
    public static void main(String[] args) {
        System.out.println("Greatest common divisor");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;
        int greater = Math.max(a, b);

        for (int i = 1; i <= greater; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}