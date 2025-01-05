package Array.operation_in_arrays;

public class PairsInArray {

    public static void printPairs(int n[]) {
        for (int i = 0; i < n.length; i++) {
            int curr = n[i];
            for (int j = i + 1; j < n.length; j++) {
                System.out.print("(" + curr + "," + n[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);

    }
}