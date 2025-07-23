package List;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(20);
        list.add(50);
        list.add(70);
        list.add(30);
        list.add(10);

        System.out.println(list);

        Collections.sort(list); // sort elements in ascending order

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // sort elements in descending order

        System.out.println(list);

    }
}