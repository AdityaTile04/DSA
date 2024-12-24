public class Unary {
    public static void main (String args[]) {
        // Unary Operators

        // Pre increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // Post increment
        int x = 10;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        // Pre Decrement
        int num1 = 10;
        int num2 = --num1;
        System.out.println(num1);
        System.out.println(num2);

        // Post Decrement
        int num3 = 10;
        int num4 = num3--;
        System.out.println(num3);
        System.out.println(num4);
    }
}