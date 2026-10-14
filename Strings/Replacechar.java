package JavaQuestions.Strings;

import java.util.Scanner;

public class Replacechar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :"+ " ");
        String str=sc.nextLine();
        System.out.print("Enter Replaceable Char :"+ " " );
        char ch1=sc.next().charAt(0);
        System.out.print("Enter Replace to char :"+ " ");
        char ch2=sc.next().charAt(0);
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==ch1){
                result=result+ch2;
            }
            else{
                result=result+ch;
            }
        }
        System.out.println(result);

    }
}
