import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        
        
        System.out.println(list.get(2));
        System.out.println(list.remove(3));
        System.out.println(list.set(3, 4));
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));
    }
}