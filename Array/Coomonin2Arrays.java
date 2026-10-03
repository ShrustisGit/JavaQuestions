package JavaQuestions.Array;

public class Coomonin2Arrays {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={5,6,7,1,9};
        System.out.print("Common numbers are :");
        for(int i =0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.print(array1[i]+" ");
                }
            }
        }

    }
}
