public class ComapareFunction {
    public static void main(String[] args) {
        String s1 = "Aditya";
        String s2 = "Aditya";

        if (s1 == s2) { // output = equal
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        String s3 = new String("Aditya");
        String s4 = new String("Aditya");

        if (s1 == s3) { // output = not equal, because s3 have diffrent memory locations
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if (s3.equals(s4)) { // output = equal, because both have same content
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}