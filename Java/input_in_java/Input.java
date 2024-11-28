package input_in_java;

import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // to capture single word
        System.out.println(input);

        String name = sc.nextLine(); // to capture spaces
        System.out.println(name);

        int number = sc.nextInt(); // to capture integers(numbers)
        System.out.println(number);

        float price = sc.nextFloat(); // to capture decimal values
        System.out.println(price);

        boolean val = sc.nextBoolean(); // to capture boolean values
        System.out.println(val);

        short shortValue = sc.nextShort(); // to capture short values 
        System.out.println(shortValue);

        long longVal = sc.nextLong(); // to capture long values
        System.out.println(longVal);
    }
}
