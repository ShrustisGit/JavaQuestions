package JavaQuestions;

public class MaxinArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,0,6,7,77,55,4};
        int max=arr[0];
        int min=arr[1];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println(max);
        System.out.println(min);
    }
}
