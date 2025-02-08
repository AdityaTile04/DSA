package practice_questions;

public class Question4 {
    public static void main(String args[]) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }
    }
}
