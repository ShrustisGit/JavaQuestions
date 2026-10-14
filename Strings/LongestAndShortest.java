package JavaQuestions.Strings;

import java.util.Scanner;

public class LongestAndShortest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        if(str.isEmpty()){
            System.out.println("0 Words");
        }
        else{
            String[] words=str.split("\\s+");
            String greater=words[0];
            String shorter=words[0];
            for(int i=0;i<words.length;i++){
                
                if(words[i].length()>greater.length()){
                    greater=words[i];
                }
                if(words[i].length()<shorter.length()){
                    shorter=words[i];
                }
            }
            System.out.println("Longest"+" "+greater);
            System.out.println("Shortest"+ " "+shorter);
        }
    }
}
