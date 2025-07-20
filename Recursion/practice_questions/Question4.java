package Recursion.practice_questions;

public class Question4 {

    public static int countSubstring(String s, int start, int end) {
        // base case
        if (start == s.length()) {
            return 0;
        }

        // count: if start and end are equal
        int count = (s.charAt(start) == s.charAt(end)) ? 1 : 0;
        if (end > s.length()) {
            count += countSubstring(s, start, end + 1);
        } else {
            count += countSubstring(s, start + 1, end + 1);
        }

        return count;
    }

    public static void main(String args[]) {
        String s = "aba";
        System.out.println("Count of substring : " + countSubstring(s, 0, 0));
    }
}
