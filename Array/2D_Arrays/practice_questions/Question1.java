package practice_questions;

public class Question1 {
    public static int printNum(int[][] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == k)
                    count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[][] = { { 4, 7, 9, 8 }, { 8, 8, 7, 8 } };
        int k = 8;
        System.out.println("count of " + k + " is : " + printNum(arr, k));
    }
}
