package JavaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        // System.out.println(arr[0]);

        for(int i =0 ; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for(int num :arr){
        //     System.out.println(num);
        // }

    }
}
