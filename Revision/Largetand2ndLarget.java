package JavaQuestions.Revision;

import java.util.Scanner;

public class Largetand2ndLarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int largest=-1;
        int SecondLargest=-1;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            if(digit>largest){
                SecondLargest =largest;
                largest=digit;
                
            }
            else if(SecondLargest < digit && digit != largest){
                SecondLargest =digit;
            }
        }
        System.out.println(largest);
        System.out.println(SecondLargest);
    }
}
