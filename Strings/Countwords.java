package JavaQuestions.Strings;

import java.util.Scanner;

public class Countwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        if(str.isEmpty()){
            System.out.println("0 Words");
        }
        else{
            String[] words=str.split("\\s+");
            System.out.println("Words :" +words.length);
        }
    }
}
