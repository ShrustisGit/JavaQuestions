package JavaQuestions;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0;i<=10;i++){
            int mul=n*i;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }
}
