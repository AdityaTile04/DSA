package Array.operation_in_arrays;

public class BinarySearch {

    public static int binarySearch(int n[], int key) {
        int start = 0, end = n.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (n[mid] == key) {
                return mid;
            } else if (n[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int key = 16;
        int bs = binarySearch(num, key);
        System.out.println("key is at index : " + bs);
    }

}