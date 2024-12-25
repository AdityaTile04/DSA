public class ElseIF {

    public static void main(String args[]) {
        int age = 18;

        if (age >= 13 && age < 18) {
            System.out.println("TEENEGER");
        } else if (age >= 18) {
            System.out.println("ADULT");
        } else {
            System.out.println("CHILD");
        }
    }
}