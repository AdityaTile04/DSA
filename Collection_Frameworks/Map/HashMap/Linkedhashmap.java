import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Pineapple");

        System.out.println(map);
    }
}
