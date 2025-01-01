public class BlockScope {
    public static void main(String args[]) {
        int i = 20;

        {
            int number = 10; // block scope
            System.out.println(number);
        }
        System.out.println(i);
        // System.out.println(number); // can not use block scope variable in function scope
    }
}
