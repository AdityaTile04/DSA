public class PrintFibonacci {

    public static int fibonnaci(int n) {
        if (n == 0 || n == 1)
            return n;
        int fnmo = fibonnaci(n - 1);
        int fnmt = fibonnaci(n - 2);
        int fn = fnmo + fnmt; 
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibonnaci(5));
    }
}
