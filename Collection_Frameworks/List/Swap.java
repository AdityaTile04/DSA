package List;

import java.util.ArrayList;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int i = 0, j = 4;
        System.out.println(list);
        swap(list, i, j);
        System.out.println(list);

    }

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
