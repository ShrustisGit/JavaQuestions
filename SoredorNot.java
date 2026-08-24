package JavaQuestions;

public class SoredorNot {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,56};
        boolean sorted=true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
            }
        }
        if(sorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
