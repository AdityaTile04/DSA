public class OptimizedPrime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
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
