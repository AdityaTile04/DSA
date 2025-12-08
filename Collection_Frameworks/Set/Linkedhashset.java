import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(50);
        linkedHashSet.add(50);
        linkedHashSet.add(40);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(17);

        findEvenOddInSet(linkedHashSet);

        for (int nums : linkedHashSet) {
            System.out.println(nums);
        }

        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.contains(10));
        System.out.println(linkedHashSet.isEmpty());
        linkedHashSet.clear();

        System.out.println(linkedHashSet);
    }

    public static void findEvenOddInSet(Set<Integer> num) {
        for (int i : num) {
            if (i % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
    }
}
