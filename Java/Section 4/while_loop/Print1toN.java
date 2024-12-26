import java.util.*;

public class Print1toN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("______________________________________________");
        int range = 1;

        while (range <= n) {
            System.out.println(range);
            range++;
        }
    }
}