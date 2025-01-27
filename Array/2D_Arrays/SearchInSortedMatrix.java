public class SearchInSortedMatrix {

    public static boolean serachInSortedMatrix(int matrix[][], int k) {
        int n = matrix.length;
        int col = matrix[0].length - 1;
        int row = 0;
        while (row < n && col >= 0) {
            if (matrix[row][col] == k) {
                System.out.println("key found at :  (" + row + "," + col + ")");
                return true;
            } else if (k < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int k = 33;
        serachInSortedMatrix(matrix, k);
    }
}