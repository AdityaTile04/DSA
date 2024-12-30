import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
        long factorial = factorial(num);

        System.out.println("Factorial of " + num + " is : " + factorial);

    }

}