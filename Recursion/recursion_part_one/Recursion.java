class Recursion {

    public static void printNumDec(int n) {
        if (n == 1) { // Base case
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printNumDec(n - 1);

    }

    public static void printNumInc(int n) {
        if (n == 1) { // Base case
            System.out.println(n);
            return;
        }
        printNumInc(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String args[]) {
        // printNumDec(10);
        printNumInc(10);
    }
} 