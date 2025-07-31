import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHS {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();

        sets.add(10);
        sets.add(20);
        sets.add(30);
        sets.add(40);

        Iterator i = sets.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (Integer set : sets) {
            System.out.println(set);
        }
    }
}
