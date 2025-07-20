public class ClassesAndObject {

    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.changeColor("orange");
        System.out.println(p1.color);
        p1.tipSize(5);
        System.out.println(p1.tip);

        BankAccount account = new BankAccount();

        account.username = "adityatile";
        account.getPassword("1234567");

        MainInfo info = new MainInfo();

        info.name = "aditya";
        // info.number = 1234;
        info.email = "aditya@gmail.com";
        System.out.println(info.name);
        System.out.println(info.email);

    }
}

class MainInfo {
    public String name;
    private int number;
    public String email;

    void getInfo(String getName, String getEmail) {
        name = getName;
        email = getEmail;
    }

}

class BankAccount {
    public String username;
    private String password;

    public void getPassword(String getPassword) {
        password = getPassword;
    }
}

class Pen {
    String color;
    int tip;

    void changeColor(String newColor) {
        color = newColor;
    }

    void tipSize(int tipSize) {
        tip = tipSize;
    }
}

class Student {
    String name;
    int rollNo;
    int marks;

    void printName(String printName) {
        name = printName;
    }

    void printRollNumber(int rollNumber) {
        rollNo = rollNumber;
    }

    void printMarks(int mrks) {
        marks = mrks;
    }
}