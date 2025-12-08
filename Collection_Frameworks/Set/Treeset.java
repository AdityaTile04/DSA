import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("Gaurav");
        set.add("Kunal");
        set.add("Aniket");
        set.add("Nikhil");
        set.add("Aditya");

        for (String str : set) {
            System.out.println(str);
        }

        for (String str : set) {
            if (str.contains("Raju")) {
                System.out.println("Gaurav found...");
            } else {
                System.out.println("Not Found");
            }
        }

        System.out.println(set);

    }
}
