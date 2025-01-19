import java.util.Scanner;

public class Matrix {

    public static boolean search(int matrix[][], int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == k) {
                    System.out.println("key found at cell : (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element is : " + largest);
    }

    // this function is for printing output
    public static void printArr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        // this take input of 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr(matrix); // print array
        search(matrix, 5); // to print cell of array
        largest(matrix); //to 
    }
}