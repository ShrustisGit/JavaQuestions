package JavaQuestions;

public class MaxinArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6,7,77,55,4};
        int max=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println(max);
    }
}
