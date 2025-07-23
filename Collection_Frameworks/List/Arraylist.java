package List;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();

      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);

      System.out.println(list);
      System.out.println(list.get(3));
      System.out.println(list.remove(3));
      System.out.println(list);
      System.out.println(list.set(2, 25));
      System.out.println(list);
      list.add(2, 15);
      System.out.println(list);
      System.out.println(list.size());
      System.out.println(list.contains(15));
      System.out.println(list.contains(11));
      System.out.println(list.isEmpty());

      for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) +  " ");
      }

    }
}