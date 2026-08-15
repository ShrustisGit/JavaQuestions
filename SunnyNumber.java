package JavaQuestions;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = n + 1;
        int root = (int) Math.sqrt(num);

        if (root * root == num) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not Sunny Number");
        }

        sc.close();
    }
}