package Recursion.practice_questions;

public class Question1 {

    public static void occurence(int arr[], int key, int idx) {
        // base case
        if (idx == arr.length) {
            return;
        }
        // if current index match the key, print that index
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        occurence(arr, key, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 5, 2, 6 };
        occurence(arr, 2, 0);
    }
}
