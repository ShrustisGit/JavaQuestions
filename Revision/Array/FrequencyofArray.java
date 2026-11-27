package JavaQuestions.Revision.Array;

import java.util.Scanner;

public class FrequencyofArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] array=new int[n];
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    boolean[] visited=new boolean[n];
    for(int i=0;i<array.length;i++){
        if(visited[i]){
            continue;
        }
        int count=1;
        for(int j=i+1;j<n;j++){
            if(array[i]==array[j]){
                count++;
                visited[j]=true;
            }
        }
        System.out.println(array[i]+"Occurs"+count+"times");
    }
}
 }