package Sorting_Algorithms;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // no of turns
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 2, 1, 3 };
        insertionSort(arr);
        printArr(arr);
    }
}
