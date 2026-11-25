package JavaQuestions.Array;

import java.util.Scanner;

public class Merge2Array {
    public static void main(String[] args) {
        int[] arr1={2,3,1};
        int[] arr2={6,5,4};
        int[] arr3 = new int[arr1.length + arr2.length];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
        System.out.print("Merged Array :");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
        System.out.println();
        System.out.print("Soted Array : ");
        for(int i=0;i<arr3.length;i++){
            for(int j=i+1;j<arr3.length;j++){
                if(arr3[i]>arr3[j]){
                    int temp=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }
}
