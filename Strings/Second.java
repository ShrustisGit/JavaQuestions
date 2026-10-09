package JavaQuestions.Strings;

public class Second {
    public static void main(String[] args) {
        String name=new String("Shrusti");
        String name2=new String("Shrusti");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));//Only checks values 

        String a="Shrusti";
        String b ="Shrusti";
        String c=a;
        System.out.println(a==b);
        System.out.println(c==a);
        System.out.println(a.charAt(0));
    }
}
