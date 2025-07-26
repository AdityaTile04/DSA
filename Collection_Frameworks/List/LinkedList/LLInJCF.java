package LinkedList;

import java.util.LinkedList;

public class LLInJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
