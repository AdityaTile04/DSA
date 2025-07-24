package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = list.size();

        for(int i = n -1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
