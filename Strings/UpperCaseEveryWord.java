package JavaQuestions.Strings;

public class UpperCaseEveryWord {
    public static void main(String[] args) {
        String str="java is easy lang.";
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words){
            result.append(
                Character.toUpperCase(word.charAt(0))
            );
            result.append(word.substring(1));
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
