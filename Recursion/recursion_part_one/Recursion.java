class Recursion {

    public static void printNum(int n) {
        if (n == 1) { // Base case
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printNum(n - 1);

    }

    public static void main(String args[]) {
        printNum(10);
    }
}