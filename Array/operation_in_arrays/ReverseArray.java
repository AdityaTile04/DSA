package Array.operation_in_arrays;

public class ReverseArray {

    public static void reverseArray(int n[]) {
        int first = 0, last = n.length - 1;

        while (first < last) {
            int temp = n[last];
            n[last] = n[first];
            n[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}