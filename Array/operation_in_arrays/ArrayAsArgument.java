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

    public static void main(String args[]) {
        int marks[] = { 90, 88, 95 };
        update(marks);

        for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
        }

        int numbers[] = { 1, 2, 3, 4, 5 };
        change(numbers);

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("numbers = " + numbers[i]);
        }
    }
}
