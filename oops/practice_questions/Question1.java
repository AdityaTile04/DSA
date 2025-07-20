package practice_questions;

public class Question1 {
    public static void main(String args[]) {
        Complex c = new Complex();
        System.out.println(c.sum(10, 10));
        System.out.println(c.product(10, 5));
    }
}

class Complex {
    int sum(int a, int b) {
        return a + b;
    }

    int product(int a, int b) {
        return a * b;
    }

}
