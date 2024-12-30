public class CallByValue {

    public static int changeA(int x) {
        x = 10;
        return x;
    }

    public static void main(String args[]) {
        int a = 10, b = 20;

        // swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);

        // call by value
        int x = 5;
        changeA(x); // copy of variable
        System.out.println(a);

    }
}