public class Inheritance {
    public static void main(String args[]) {
        Dog labredor = new Dog();

        labredor.eat();
        labredor.bark();
        labredor.color = "white";
        System.out.println(labredor.color);

        Man m = new Man();

        m.language = "English";
        m.run();
        m.jump();
        m.skinColor = "white";
        System.out.println(m.skinColor);
        System.out.println(m.language);

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void bark() {
        System.out.println("barks");
    }

}

class Dog extends Animal {
    String breed;
}

class Human {
    String skinColor;
    String eye;
    String foots;

    void run() {
        System.out.println("runs");
    }

    void jump() {
        System.out.println("jump");
    }
}

class Man extends Human {
    String language;
}