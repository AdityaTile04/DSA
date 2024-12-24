public class Relational {
    public static void main (String args[]) {

        int a = 10;
        int b = 10;

        int A = 20;
        int B = 10;

        System.out.println(a == b);
        System.out.println(A == B);

        int x = 10;
        int y = 5;

        int X = 10;
        int Y = 10;

        System.out.println(x != y);
        System.out.println(Y != X);

        int num1 = 20;
        int num2 = 10;

        int num3 = 10;
        int num4 = 20;

        // Greater than
        System.out.println(num1 > num2); 
        System.out.println(num3 > num4); 
        // Less than
        System.out.println(num1 < num2);
        System.out.println(num3 < num4);
        // Greater than equal to
        System.out.println(num1 >= num2);
        // Less than equal to
        System.out.println(num3 <= num4);
    }
}