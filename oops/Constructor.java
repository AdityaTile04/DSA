public class Constructor {
    public static void main(String[] args) {
        Student info = new Student("Aditya", 55); // Constructor runs automatically
        System.out.println(info.name);
        System.out.println(info.rollNo);

        Pen p = new Pen("Blue", 6); // Constructor runs automatically
        System.out.println(p.color);
        System.out.println(p.tip);

        Car c = new Car();
        Car c1 = new Car("black", "BMW 7 Series");
        Car c2 = new Car(15000000);
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c2.price);

    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int roll) { // Constructor
        this.name = name;
        this.rollNo = roll;
    }
}

class Pen {
    String color;
    int tip;

    Pen(String color, int tip) { // Constructor
        this.color = color;
        this.tip = tip;
    }
}

// Types of Constructors

class Car {
    String color;
    String model;
    int price;

    // Non-Parameterized
    Car() {
        System.out.println("this is a type of non-parameterized constructor");
    }

    // Parameterized
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    Car(int price) {
        this.price = price;
    }

}