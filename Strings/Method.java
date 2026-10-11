package JavaQuestions.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name="Shrusti Halli";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.trim());
        System.out.println(name.replace("s","P"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.strip());
        System.out.println(name.split(name, 1));
    }
}
