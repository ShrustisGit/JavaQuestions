package JavaQuestions;
import java.util.Scanner;

public class MinMax2ndway {
    public static void main(String[] args) {
        System.out.println("Mix or Max");
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int[] arr = {1,2,3,4,5};

        int maxval = arr[0];
        int minval = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxval) {
                maxval = arr[i];
            }

            if (arr[i] < minval) {
                minval = arr[i];
            }
        }

        System.out.println("Maximum = " + maxval);
        System.out.println("Minimum = " + minval);
    }
}