import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {

        // how to declared the string
        String str = "abcd";
        String str2 = new String("abcd");

        Scanner sc = new Scanner(System.in);

        // Input/Output in strings
        String name;
        System.out.println("Enter the name : ");
        name = sc.nextLine();
        System.out.println("Name is : " + name);

    }
}