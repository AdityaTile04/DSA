package input_in_java;

import java.util.*;

public class Product {
    public static void main (String args[]) {
        // to calculate product

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Input a = " + a);

        int b = sc.nextInt();
        System.out.println("Input b = " + b);

        int product = a * b;
        System.out.println("The product of a & b = " + product);
    }
}
