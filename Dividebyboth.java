package JavaQuestions;

import java.util.Scanner;

public class Dividebyboth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num % 5==0 && num % 11 == 0) {
            System.out.println("Number divide by both 5 & 11");
        
        if(num % 5 == 0){
            System.out.println("Divide by 5 only");
        }
        else{
            System.out.println("Divide by 11 only");
        }
    }
        else if(num % 5 != 0 && num % 11 !=0){
        System.out.println("Enter another number this number is not ddivisible of both ");
    }
    }
}
