package Array.operation_in_arrays;

import java.util.*;

public class LargestNumber {

    public static int findLargest(int number[]) {
        int max = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int numbers[] = { 100, 50, 3000, 500, 600, };
        int largest = findLargest(numbers);
        System.out.println("largest is : " + largest);
    }
}