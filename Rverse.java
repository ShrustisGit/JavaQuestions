package JavaQuestions;

import java.util.Scanner;

public class Rverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int digit=n % 10;
            n=n/10;
            reverse = reverse * 10 + digit; 
            // the reverse 
            // reverse = 0* 10 + 5; = 5 is 1st digit then it will decreament  
            // reverse = 5 ; and so on
            
        }
        System.out.println(reverse);
    }
}
