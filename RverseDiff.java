package JavaQuestions;

import java.util.Scanner;

public class RverseDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n % 10;
            n=n/10;
            reverse = reverse * 10 + digit; 
            
            
    }
    System.out.println(reverse);
    int diff=reverse - original;
    System.out.println(diff);
    
    
}
}
