package JavaQuestions.Array;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int target=78;
        boolean found=false;
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i] + array[j] ==target){
                    System.out.println(array[i] + " "+array[j]);
                }
            }
        }
        if(!found){
            System.out.println("Pair not found");
        }
    }
}
