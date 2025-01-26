public class DiagonalSum {

    public static int diaginalSum(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;

        // brute force approach and time complexity is O(n^2)
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         } else if (i + j == n - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // optimized time complexity is O(n)
        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += arr[i][i];

            // secondary diagonal
            if (i != n - 1 - i)
                sum += arr[i][n - i - 1];
        }

        System.out.println("Sum is : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        diaginalSum(arr);
    }
}
