package JavaQuestions.Array;

public class SearchinArr {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int tar=6;
        boolean found=false;
        for(int i=0;i<array.length;i++){
            if(array[i] == tar){
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Elment Found");
        }
    }
}
