import java.util.Scanner;

public class Product {

    public static int product(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        int product = product(a, b);
        System.out.println("product of a and b is : " + product);
    }
}