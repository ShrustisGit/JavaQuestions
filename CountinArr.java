package JavaQuestions;

public class CountinArr {
    public static void main(String[] args) {
        int[] array={1,2,-2,3,-3,0,0};
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<array.length;i++){
            if(array[i] > 0){
                pos++;
            }
            else if(array[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Number of zero"+" "+zero);
        System.out.println("Number of Positive"+" "+pos);
        System.out.println("Number of Negative"+" "+neg);
    }
}
