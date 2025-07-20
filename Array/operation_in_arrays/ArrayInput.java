package Array.operation_in_arrays;

import java.util.*;

public class ArrayInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];

        // input in array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("Physics = " + marks[0]);
        System.out.println("Math = " + marks[1]);
        System.out.println("Chemistry = " + marks[2]);
        System.out.println("Biology = " + marks[3]);

        // updation
        marks[2] = 85;
        System.out.println("Math = " + marks[2]);

        marks[3] = marks[3] + 1;
        System.out.println("Chemistry = " + marks[3]);

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;
        System.out.println("percentage = " + percentage);

        // length of array
        int length = marks.length;
        System.out.println("length of array is : " + length);

        // Example 2
        String menus[] = { "Dosa", "Samosa", "Mango shake", "pizza" };

        System.out.println("Canteen Menus : ");
        System.out.println(menus[0]);
        System.out.println(menus[1]);
        System.out.println(menus[2]);
        System.out.println(menus[3]);

        // Example 3
        String cars[] = new String[5];

        cars[0] = sc.next();
        cars[1] = sc.next();
        cars[2] = sc.next();
        cars[3] = sc.next();

        System.out.println("car brand : " + cars[0]);
        System.out.println("car brand : " + cars[1]);
        System.out.println("car brand : " + cars[2]);
        System.out.println("car brand : " + cars[3]);
    }

}
