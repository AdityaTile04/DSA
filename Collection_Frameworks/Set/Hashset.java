
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(20);

        for (int num : set) {
            System.out.println(num);
        }

        System.out.println(set.size());
        System.out.println(set.contains(10));
        System.out.println(set.isEmpty());
        set.clear();

        System.out.println(set);
    }
}