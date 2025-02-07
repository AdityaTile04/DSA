public class EvenOdd {
    public static void evenOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("The number " + n + " is even");
        } else {
            System.out.println("The number " + n + " is odd");
        }
    }

    public static void main(String args[]) {
        evenOdd(3);
        evenOdd(10);
        evenOdd(5);
    }

}
