package JavaQuestions.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="Shrusti";
        System.out.println("String is : "+str);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String is : "+sb);
    }
}
