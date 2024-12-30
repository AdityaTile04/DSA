import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);

        int binomialCoefficient = n_fact / (r_fact * n_r_fact);

        return binomialCoefficient;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();

        int bc = binomialCoefficient(n, r);

        System.out.println("The binomial coefficient of n and r is : " + bc);

    }
}
