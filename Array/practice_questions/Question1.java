package Array.practice_questions;

public class Question1 {

    public static boolean checkIsRepeat(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 4 };
        System.out.println(checkIsRepeat(n));
    }
}