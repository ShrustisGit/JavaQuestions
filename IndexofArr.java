package JavaQuestions;

public class IndexofArr {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int target=6;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("Index"+" "+i);
            }
        }
    }
}
