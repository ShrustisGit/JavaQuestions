
package JavaQuestions.Strings;

import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isDigit = !str.isEmpty();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                isDigit = false;
                break;
            }
        }

        if (isDigit) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Contains non-digit characters");
        }

        sc.close();
    }
}
