public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = factorial(n - 1) * n;

        return fact;

    }

    public static void main(String args[]) {
        System.out.println(factorial(5));
    }
}
