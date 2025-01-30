import java.util.Scanner;

public class Question1 {
    public static void main(String args[]) {
        System.out.println("Enter word : ");
        String str = new Scanner(System.in).next();
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("count of vowels is : " + count);
    }
}