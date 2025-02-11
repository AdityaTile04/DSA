public class Constructor {
    public static void main(String[] args) {
        Student info = new Student("Aditya", 55);
        System.out.println(info.name);
        System.out.println(info.rollNo);

        Pen p = new Pen("Blue", 6);
        System.out.println(p.color);
        System.out.println(p.tip);

    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int roll) {
        this.name = name;
        this.rollNo = roll;
    }
}

class Pen {
    String color;
    int tip;

    Pen(String color, int tip) {
        this.color = color;
        this.tip = tip;
    }
}