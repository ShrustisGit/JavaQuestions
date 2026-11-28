package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("Coun Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                pos++;
            }
            else if(array[i]<0){
                neg++;
            }
            else if(array[i] == 0){
                zero++;
            }
        }
        System.out.println("Positive : "+pos);
        System.out.println("Negative : "+neg);
        System.out.println("Zero : "+zero);
    }
}
