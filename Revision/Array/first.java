package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter Array : ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
