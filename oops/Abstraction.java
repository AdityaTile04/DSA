public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Chicken c = new Chicken();
        d.eat();
        d.walk();
        c.eat();
        c.walk();

        System.out.println(d.color);

        Labredor l = new Labredor();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }

    void changeColor() {
        color = "brown";
    }

    void walk() {
        System.out.println("walks on 4 leg");
    }
}

class Labredor extends Dog {
    Labredor() {
        System.out.println("Labredor constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}