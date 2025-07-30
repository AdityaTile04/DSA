import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Russia", 25);
        map.put("England", 10);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key: " + k + ", Value: " + map.get(k));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        HashMap<String, Integer> data = new HashMap<>();

        data.put("Aditya", 50000);
        data.put("Rushi", 40000);
        data.put("Tejas", 40000);
        data.put("Ujjwal", 100000);

        Set<String> keys1 = data.keySet();

        for (String k : keys1) {
            System.out.println("key: " + k + ", values: " + data.get(k));
        }

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Computer Networks", 95);
        marks.put("Data Structures And Algorithms", 99);
        marks.put("Operating Systems", 95);
        marks.put("Database Management System", 95);

        Set<String> keys2 = map.keySet();
        for (String k : keys2) {
            System.out.println("key: " + k + ", value: " + map.get(k));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
