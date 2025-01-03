package Array.operation_in_arrays;

import java.util.*;

public class ArrayInput {
    public static void main(String args[]) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

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
    }

}
