package JavaQuestions;

public class SearchinArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=5;
        boolean found=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found =true;
                break;
            }
            
        }
        if(found){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
