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

        Car c4 = new Car(c1); // Creating a copy of car1
        System.out.println(c4.color);
        System.out.println(c4.model);

        Marks m = new Marks(80, 94, 95);

        System.out.println(m.physics);
        System.out.println(m.chemistry);
        System.out.println(m.math);

        System.out.println("Using copy constructor : ");

        Marks m1 = new Marks(m);
        System.out.println(m1.physics);
        System.out.println(m1.math);

        A a = new A(10, "Aditya");
        A b = new A(a);
        System.out.println(b.a);
        System.out.println(b.b);

    }
}

class A {
    int a;
    String b;

    A(int a, String b) {
        this.a = a;
        this.b = b;

        System.out.println(a + " " + b);
    }

    A(A ref) {
        a = ref.a;
        b = ref.b;

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

    // Copy Constructor (Takes another Car object as parameter)
    Car(Car newCar) {
        this.color = newCar.color;
        this.model = newCar.model;
        this.price = newCar.price;
    }

}

// copy constructor
class Marks {
    int physics;
    int chemistry;
    int math;

    // void getMarks(int phy, int chem, int math) {
    // this.physics = phy;
    // this.chemistry = chem;
    // this.math = math;
    // }

    Marks(int phy, int chem, int math) {
        this.physics = phy;
        this.chemistry = chem;
        this.math = math;
    }

    Marks(Marks newMarks) {
        this.physics = newMarks.physics;
        this.math = newMarks.math;
    }
}