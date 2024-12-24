public class Logical {
    public static void main (String args[]) {
        int a = 20;
        int b = 10;

        int x = 10;
        int y = 20;

        // Logical AND (&&)
        System.out.println((a > b) && (x < y)); // T and T = true
        System.out.println((a > b) && (x > y)); // T and F = fasle
        System.out.println((a < b) && (x < y)); // F and T = false
        System.out.println((a < b )&& (x > y)); // F and F = false

        // Logical OR (||)
        System.out.println((a > b) || (x < y)); // T OR T = true
        System.out.println((a > b) || (x > y)); // T OR F = true
        System.out.println((a < b) || (x < y)); // F OR T = true
        System.out.println((a < b) || (x > y)); // F OR F = false


        // Logical NOT (!)
        System.out.println(!(a > b)); // T = F
        System.out.println(!(x > y)); // F = T

    }
}