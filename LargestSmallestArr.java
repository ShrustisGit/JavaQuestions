package JavaQuestions;
import java.util.Scanner;

public class LargestSmallestArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
        System.out.println("Difference: " + difference);

        sc.close();
    }
}
