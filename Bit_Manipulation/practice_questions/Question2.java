package practice_questions;

public class Question2 {
    public static void main(String args[]) {
        int x = 3, y = 4;
        System.out.println("Before swap x : " + x + " and y : " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swapping x : " + x + " and y : " + y);
    }
}
