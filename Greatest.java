package JavaQuestions;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        System.out.println("Greater");
        Scanner sc=new Scanner(System.in);
        // int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // if(num1 > num2){
        //     System.out.println("Number 1 is greater");
        // }
        // else{
        //     System.out.println("Number 2 is greater");
        // }

        // Lagest of 3
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("1st number is greater");
        }
        else if(b>a && b>c){
            System.out.println("2nd number is greater");
        }
        else{
            System.out.println("3rd number is greater");
        }
    }
}
