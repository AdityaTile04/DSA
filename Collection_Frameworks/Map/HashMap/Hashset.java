import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
        if (set.contains(20)) {
            System.out.println("Contained");
        } else if (set.contains(40)) {
            System.out.println("Contained");
        }

        System.out.println(set.remove(30));
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println(set.size());
    }
}
