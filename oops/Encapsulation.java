public class Encapsulation {
    // Encapsulation means hiding data (variables) inside a class and allowing
    // access only through methods (getters and setters).

    public static void main(String[] args) {
        Name n = new Name();
        n.getName("Aditya Tile");
        n.showName();
    }
}

class Name {
    private String name;

    String getName(String newName) {
        return this.name = newName;
    }

    void showName() {
        System.out.println(name);
    }

}
