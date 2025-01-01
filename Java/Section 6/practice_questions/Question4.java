public class Question4 {
    public static int min(int a, int b) {
        int min = Math.min(a, b);
        return min;
    }

    public static int max(int a, int b) {
        int max = Math.max(a, b);
        return max;
    }

    public static int squareRoot(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt;
    }

    public static int abs(int n) {
        int avg = Math.abs(n);
        return avg;
    }

    public static int power(int x, int y) {
        int pow = (int) Math.pow(x, y);
        return pow;
    }

    public static void main(String args[]) {
        System.out.println("The min is : " + min(10, 20));
        System.out.println("The max is : " + max(10, 20));
        System.out.println("The square root is : " + squareRoot(10));
        System.out.println("The absolute value is : " + abs(-10));
        System.out.println("The absolute value is : " + power(2, 3));
    }
}