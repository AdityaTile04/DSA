package Sorting_Algorithms;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // turns
            int smallest = i;
            for (int j = i + 1; j < n; j++) { // start of unsorted array
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);
    }
}
