package JavaQuestions;

public class MaxinArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6,7,77,55,4};
        int minimum=arr[0];
        int maximum=arr[1];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
            else if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println("Max is"+" "+maximum);
        System.out.println("Min is "+" "+minimum);
    }
}
