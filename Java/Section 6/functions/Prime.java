public class Prime {

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 2) {
            isPrime = true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("number " + n + " is prime");
        } else {
            System.out.println("number " + n + " is not prime");
        }

        return isPrime;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(6));
    }
}