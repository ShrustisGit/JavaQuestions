package JavaQuestions.Strings;

import java.util.Scanner;

public class GreatestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        if(str.isEmpty()){
            System.out.println("0 Words");
        }
        else{
            String[] words=str.split("\\s+");
            String greater="";
            for(int i=0;i<words.length;i++){
                
                if(words[i].length()>greater.length()){
                    greater=words[i];
                }
                

                
            }
            System.out.println(greater);
        }
    }
}
