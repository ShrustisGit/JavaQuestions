package JavaQuestions.Strings;

import java.util.Scanner;

public class OccurrenceofTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String -"+" ");
        String str=sc.nextLine();
        System.out.println("Enter tagreted Element-"+" ");
        char target=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == target){
                count++;
            }
        }
        System.out.println("Count is"+count);
    }
}
