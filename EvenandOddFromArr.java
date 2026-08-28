package JavaQuestions;

public class EvenandOddFromArr {
    public static void main(String[] args) {
        System.out.println("Even Odd In Array ";
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even"+" " +even);
        System.out.println("Odd"+" "+odd);
    }
}
