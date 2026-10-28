package JavaQuestions.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("First Array");
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        array[1]=100;
        System.out.println(Arrays.toString(array));
    }
}
