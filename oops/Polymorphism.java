public class Polymorphism {
    public static void main(String args[]) {
        Calculator a = new Calculator();
        System.out.println(a.add(10, 50));
        System.out.println(a.add(1000000, 10000000));
        System.out.println(a.add(1.5, 4.33));

        Dog d = new Dog();
        d.color();
    }
}

// types of polymorphism
// 1. Method or Function Overloading
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
// 2. Method or Function Overriding

class Animal {
    void color() {
        System.out.println("black");
    }
}

class Dog extends Animal {
    void color() {
        System.out.println("white");
    }
}