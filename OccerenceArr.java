package JavaQuestions;

public class OccerenceArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4,6,4};
        int target=4;
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }

        }
        System.out.println("Occurnce of"+" "+ target+ " "+ count);
    }
}
