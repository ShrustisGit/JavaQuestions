package JavaQuestions.Strings;

import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String Upper=str.toUpperCase();
        String lower=str.toLowerCase();
        System.out.println("Upper Case = "+Upper);
        System.out.println("Lower Case ="+lower);
    }
}
