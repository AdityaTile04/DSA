public class TimeComplexity {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Largest is: " + largest(arr));

        int arr2[] = new int[1000000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1; // Filling the array with values from 1 to 1000000
        }

        System.out.println("Largest using constant time is: " +
                largestUsingConstantTime(arr2));
    }

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest; // takes O(n) time
    }

    public static int largestUsingConstantTime(int[] arr) {
        int largest = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[largest] < arr[i]) {
                largest = i;
            }
        }
        return largest;
    }
}