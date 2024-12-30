import java.util.Scanner;

public class Parameter {
    public static int sumOfTwoDigits(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiplication(int x, int y) {
        int mul = x * y;
        return mul;
    }

    public static int subtraction(int o, int p) {
        int sub = o - p;
        return sub;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // using sum function
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        int sum = sumOfTwoDigits(a, b);

        System.out.println("The sum is : " + sum);

        // using multiplication function
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter y : ");
        int y = sc.nextInt();
        int mul = multiplication(x, y);

        System.out.println("multiplication is : " + mul);

        // using subtraction function
        System.out.println("Enter o : ");
        int o = sc.nextInt();
        System.out.println("Enter p : ");
        int p = sc.nextInt();
        int sub = subtraction(o, p);

        System.out.println("subtraction is : " + sub);

    }
}