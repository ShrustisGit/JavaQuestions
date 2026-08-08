package JavaQuestions;

import java.util.Scanner;

public class PrintuntilNth {
    public static void main(String[] args) {
        System.out.println("Print until nth");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }
    }
}
