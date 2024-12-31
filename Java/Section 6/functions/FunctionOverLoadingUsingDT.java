public class FunctionOverLoadingUsingDT {

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static float multiply(float a, float b) {
        return a * b;
    }

    public static void main (String args[]) {
        System.out.println("multiplication of a and b is : " + multiply(5, 5));
        System.out.println("multiplication of float a and b is : " + multiply(5.8f, 3.7f));
    }
}
