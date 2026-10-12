package JavaQuestions.Strings;

import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result=str.replace(" ", "");
        System.out.println(result);
    }
}
