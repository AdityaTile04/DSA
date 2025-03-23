package Recursion.practice_questions;

public class Question2 {

    static String words[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToWord(int num) {
        // base case
        if (num == 0) {
            return;
        }
        // recursive call for remaining numbers
        numToWord(num / 10);
        // printting last digits in words
        System.out.print(words[num % 10] + " ");

        // special case for 0
        if (num == 0) {
            System.out.println("zero");
        }

    }

    public static void main(String args[]) {
        numToWord(2019);
    }
}
