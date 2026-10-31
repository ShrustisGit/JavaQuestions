package JavaQuestions.Array;

import java.util.Scanner;

public class MissingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n-1];

        int sum = 0;

        for(int i = 0; i < n-1; i++){
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }

        int sum2 = n * (n + 1) / 2;

        int missing = sum2 - sum;

        System.out.println("Missing: " + missing);


        
    }
}
