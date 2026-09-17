package JavaQuestions;

public class SearchinArr {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int target=65;
        System.out.println("Taget is"+ " "+ target);
        boolean found=false;
        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                found=true;
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
