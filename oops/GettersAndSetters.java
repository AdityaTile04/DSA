public class GettersAndSetters {
    public static void main(String args[]) {
        Pen p = new Pen();

        p.getColor("Red");
        p.getPrice(10);

        System.out.println(p.getColor("red"));
        System.out.println(p.getPrice(10));

        Name n = new Name();
        n.getName("aditya");
        n.printName();

    }
}

class Name {
    private String name;

    String getName(String name) {
        return this.name = name;
    }

    void printName() {
        System.out.println(name);
    }
}

class Pen {
    private String color;
    private int price;

    String getColor(String penColor) {
        return this.color;
    }

    int getPrice(int penPrice) {
        return this.price;
    }
}
