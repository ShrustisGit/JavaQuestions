package JavaQuestions.Revision;

import java.util.Scanner;

public class Find1stdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=12345;
        System.out.println(n);
        while (n>=10) {
            
            n=n/10;
            
        }
        System.out.println("First Digit is : "+n);
    }


}




