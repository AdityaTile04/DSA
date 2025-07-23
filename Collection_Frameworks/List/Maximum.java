package List;

import java.util.ArrayList;
import java.util.List;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(20);
        list.add(50);
        list.add(70);
        list.add(30);

        int n = list.size();

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Largest is: " + max);
    }
    
}
