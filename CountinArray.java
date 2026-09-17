package JavaQuestions;

public class CountinArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,1,6,5,1,1,1};
        int count=0;
        int target=1;
        for(int i =0;i<array.length;i++){
            if(array[i]==target){
                count++;
            }
        }
        System.out.println(target +" "+"Occurs"+" "+count+" "+"times");
    }
}
