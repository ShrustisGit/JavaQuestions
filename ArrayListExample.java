package JavaQuestions;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.remove(0);
      list.set(0, 100);
      System.out.println(list);
      System.out.println(list.contains(40));
      
      
    }
}
