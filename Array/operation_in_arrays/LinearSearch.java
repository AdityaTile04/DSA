package Array.operation_in_arrays;

public class LinearSearch {
    public static int linearSearch(int n[], int key) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int menus(String menu[], String k) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static int findNames(String name[], String x) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // example 1
        int numbers[] = { 2, 4, 6, 8, 10, 10, 14 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index : " + index);
        }

        // example 2
        String menus[] = { "Dosa", "Samosa", "Vada Pav", "Coke" };
        String k = "Coke";
        int i = menus(menus, k);
        if (i == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index : " + i);
        }

        // example 3
        String names[] = { "Aditya", "Gaurav", "Kunal", "Rushi" };
        String x = "Aditya";

        int idx = findNames(names, x);
        if (idx == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index : " + idx);
        }
    }
}
