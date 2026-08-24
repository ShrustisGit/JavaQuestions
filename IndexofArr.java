package JavaQuestions;

public class IndexofArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Inde"+" "+i);
            }
        }
    }
}
