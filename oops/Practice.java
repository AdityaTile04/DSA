
public class Practice {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aditya";
        System.out.println(s.name);

        Person p = new Person();
        p.name = "Aditya";
        p.weight = 45;
        System.out.println(p.name + " " + p.weight);

        Vehical obj1 = new Car();
        obj1.print(); // Derived class (Car)

        Vehical obj2 = new Vehical();
        obj2.print(); // Base class (Vehical)

        Parent obj3 = new Child();
        // obj3.print1(); // error

        Parent obj4 = new Parent();
        obj4.print();

        Book b1 = new Book(150);
        Book b2 = new Book(250);

        System.out.println(Book.count);

        Test t = new Test();
        t.set_marks(80);
        System.out.println(Test.marks);

        Math m = new Math();
        m.changeb();
        System.out.println(Math.a + Math.b);

    }
}

// 1

class Person {
    String name;
    int weight;
}

// 2
class Student extends Person {
    String name;
    int marks;
}

// 3
class Vehical {
    void print() {
        System.out.println("Base class (vehical)");
    }
}

class Car extends Vehical {
    void print() {
        System.out.println("Derived class (car)");
    }
}

class Parent {
    void print() {
        System.out.println("Base class (parent)");
    }
}

class Child extends Parent {
    void print1() {
        System.out.println("Derived class (child)");
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

class Test {
    static int marks;

    void set_marks(int marks) {
        this.marks = marks;
    }
}

class Math {
    static int a = 10;
    static int b;

    static void changeb() {
        b = a * 3;
    }

    public static float sqrt(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sqrt'");
    }
}