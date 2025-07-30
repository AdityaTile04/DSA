import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Russia", 25);
        map.put("England", 10);

        int getValue = map.get("China"); // to get value using key
        System.out.println(getValue);
        System.out.println(map.containsKey("Russia")); // true
        System.out.println(map.containsKey("Canada")); // false

        System.out.println(map.remove("China")); // 150
        System.out.println(map.remove("Brazil")); // null
        System.out.println(map);

        System.out.println(map.size()); // to check size is hashMap
        System.out.println(map.isEmpty());
        System.out.println(map.keySet()); // return all key
        System.out.println(map.values()); // return all key
        System.out.println(map.entrySet()); // return all key-value pairs
        map.clear(); // clear key-values
        System.out.println(map);

    }
}