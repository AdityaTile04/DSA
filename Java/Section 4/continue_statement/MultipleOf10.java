import java.util.*;

public class MultipleOf10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {

                continue;
            }
            System.out.println("number is : " + n);
        } while (true);

    }
}