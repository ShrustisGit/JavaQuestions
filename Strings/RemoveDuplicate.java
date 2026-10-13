package JavaQuestions.Strings;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(ch == str.charAt(j)){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                // result=result+ch;
                System.out.print(ch);
            }
        }
        
    }
}
