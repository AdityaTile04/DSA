import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Pineapple", 60);
        map.put("Apple", 90);
        map.put("Mango", 120);
        map.put("Banana", 40);

        System.out.println(map);

    }
}