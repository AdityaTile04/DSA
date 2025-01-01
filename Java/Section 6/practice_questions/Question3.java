import java.util.*;

public class Question3 {

    public static int sum(int n) {
        int sumOfDigit = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigit += lastDigit;
            n /= 10;
        }

        return sumOfDigit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");

        int n = sc.nextInt();

        System.out.println("The sum of digits is : " + sum(n));

    }
}
