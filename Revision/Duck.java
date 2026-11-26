package JavaQuestions.Revision;

import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean duck=false;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            if(digit == 0){
                duck=true;
                break;
            }
        }
        if(duck){
            System.out.println("Number is duck");
        }
        else{
            System.out.println("Not Duck");
        }
    }
}
