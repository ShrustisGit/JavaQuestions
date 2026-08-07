package JavaQuestions;
import java.util.*;


public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime or Not");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}

