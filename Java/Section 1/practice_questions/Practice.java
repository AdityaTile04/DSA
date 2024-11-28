import java.util.*;

public class Practice {
    public static void main(String args[]) {
       // Question 1
       Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a + b + c) / 3;
        System.out.println("The average of three numbers = " + sum);

        // Question 2

        int side = sc.nextInt();
        System.out.println("input of side " + side);
        int area = side * side;
        System.out.println(area);

        // Question 3
        float pencil = sc.nextFloat();
        System.out.println("pencil price " + pencil);
        float pen = sc.nextFloat();
        System.out.println("pen price " + pen);
        float erasar = sc.nextFloat();
        System.out.println("erasar price " + erasar);

        double gstRate = 0.18;
        double bill = (pencil + pen + erasar) * gstRate + (pencil + pen + erasar);
        
        System.out.println("All amount including gst = " + bill);

               
    }
}