package JavaQuestions.Array;

public class CountinArr {
    public static void main(String[] args) {
        int[] array={1,2,-3,-4,0,5,0,-6,0};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                negative++;
            }
            else if(array[i]>0){
                positive++;
            }
            else if(array[i]==0){
                zero++;
            }
        }
        System.out.println("Positive : "+" "+positive);
        System.out.println("Negative : "+" "+negative);
        System.out.println("Zero : "+" "+zero);
    }
}
