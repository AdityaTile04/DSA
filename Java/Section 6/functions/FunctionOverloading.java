public class FunctionOverloading {
    // function overloading : Same name of function but diffrent parameters.

    // using two parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    // using three parameters
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println("Sum of a and b is : " + sum(10, 20));
        System.out.println("Sum of a , b and c is : " + sum(20, 20, 20));
    }
}