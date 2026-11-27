package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class LargestOrSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int smallest=array[0];
        int largest=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>largest ){
                largest=array[i];
            }
            else if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("Smallest is : "+smallest);
        System.out.println("Largest is : "+largest);
    }
}
