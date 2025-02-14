public class Polymorphism {
    public static void main(String args[]) {
        Calculator a = new Calculator();
        System.out.println(a.add(1000000, 500000));
        System.out.println(a.add(1000000, 10000000));
        System.out.println(a.add(1.5, 4.33));
    }
}

// types of polymorphism
// 1. Method Overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}