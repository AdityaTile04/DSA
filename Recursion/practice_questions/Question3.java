package Recursion.practice_questions;

public class Question3 {

    public static int lengthOfString(String s) {
        // base case
        if (s == "") {
            return 0;
        }
        int length = 1 + lengthOfString(s.substring(1));

        return length;

    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(lengthOfString(s));
    }
}
