package Array.operation_in_arrays;

public class ArrayAsArgument {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void change(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }

    public static void modify(int arr[]) {
        arr[0] = 100;
    }

    public static void sumArray(int sum[]) {
        for (int i = 0; i < sum.length; i++) {
            sum[i] += sum[i];
        }
    }

    public static int findMax(int n[]) {
        if (n == null || n.length == 0) {
            System.out.println("Array is empty or null");
        }

        int max = n[0];

        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        // example 1
        int marks[] = { 90, 88, 95 };
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // example 2
        int numbers[] = { 1, 2, 3, 4, 5 };
        change(numbers);

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("numbers = " + numbers[i]);
        }

        // example 3
        int myArray[] = { 10, 20, 30 };

        System.out.println(myArray[0]); // 10

        modify(myArray);

        System.out.println(myArray[0]); // 100

        // example 4
        int sum[] = { 10, 20, 30, 40 };
        sumArray(sum);
        System.out.println(sum[1]);

        // example 5
        int num[] = { 5, 3, 4, 5, 9, 1 };
        System.out.println("Maximun element of array is : " + findMax(num));

    }
}
