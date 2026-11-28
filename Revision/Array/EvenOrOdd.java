package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Even Odd");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Even : ");
        for(int i=1;i<array.length;i++){
            if(array[i] %2 ==0){
                System.out.print(array[i]+" "); 
            }
            
        }
        System.out.print("Odd : ");
        for(int i=1;i<array.length;i++){
            if(array[i] %2 !=0){
                System.out.print(array[i]); 
            }
            
        }
        
    }
}
