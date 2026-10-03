package JavaQuestions.Array;

public class MaxinArr {
    public static void main(String[] args) {
        int[] array={1,2,3,0,45,6,7,77,55,4};
       int min=array[0];
       int max=array[1];
       for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            else if(array[i]<min){
                min=array[i];
            }
       }
       System.out.println("Minimum "+" "+min);
       System.out.println("Maximum"+" "+max);
    }
}
