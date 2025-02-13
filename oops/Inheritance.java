public class Inheritance {
    public static void main(String args[]) {
        // Dog labredor = new Dog();

        // labredor.eat();
        // labredor.bark();
        // labredor.color = "white";
        // System.out.println(labredor.color);

        // Man m = new Man();

        // m.language = "English";
        // m.run();
        // m.jump();
        // m.skinColor = "white";
        // System.out.println(m.skinColor);
        // System.out.println(m.language);

        // Cat jerry = new Cat();
        // jerry.color = "black";
        // jerry.legs = 4;
        // jerry.meow();
        // jerry.eat();
        // System.out.println(jerry.color);
        // System.out.println(jerry.legs);

        // Fish f = new Fish();
        // Bird b = new Bird();

        // f.color = "red";
        // System.out.println(f.color);
        // f.eat();
        // f.swim();

        // b.color = "blue";
        // System.out.println(b.color);
        // b.fly();
        // b.eat();

        Tuna t = new Tuna();
        t.color();
        t.eat();
        t.swim();

        Shark s = new Shark();
        s.color = "black";
        System.out.println(s.color);
        s.swim();

        Peakock p = new Peakock();
        p.color = "purple";
        p.eat();
        p.fly();
        p.feather();

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

// types of inheritance
// 1.Single Level Inheritance
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

// 2.Multi Level Inheritance
class Mammal extends Animal {
    int legs;
}

class Cat extends Mammal {
    void meow() {
        System.out.println("meow");
    }
}

// 3.Heirarchical Inheritance

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

// 4.Hybrid Inheritance

class Tuna extends Fish {
    void color() {
        System.out.println("grey");
    }
}

class Shark extends Fish {
    void teeth() {
        System.out.println("teeth");
    }
}

class German extends Dog {
    void legs() {
        System.out.println("4");
    }
}

class Peakock extends Bird {
    void feather() {
        System.out.println("feather");
    }
}