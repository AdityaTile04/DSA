package practice_questions;

public class Question2 {

    public static void sumOfNumbers(int[][] arr) {
        int sum = 0;
        int m = arr[0].length; // col
        for (int j = 0; j < m; j++) {
            sum += arr[1][j];
        }
        System.out.println("sum is : " + sum);
        ;
    }

    public static void main(String args[]) {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sumOfNumbers(arr);
    }
}
