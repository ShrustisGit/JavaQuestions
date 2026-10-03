package JavaQuestions.Array;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=6;
        boolean found=false;
        for(int i= 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    found=true;
                    System.out.println(arr[i] + " " + arr[j]);
                    
                }
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
