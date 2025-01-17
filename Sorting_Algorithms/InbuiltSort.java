package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };

        Arrays.sort(arr); // sorted array 1,2,3,4,5
        Arrays.sort(arr, 0, 3); // print array with starting index and ending index: 3,4,5,1,2

        // to print array in reverse order
        Integer n[] = { 2, 3, 1, 5, 4 };
        Arrays.sort(n, Collections.reverseOrder());
        Arrays.sort(n, 0, 3, Collections.reverseOrder());
        printArr(n);
    }
}
