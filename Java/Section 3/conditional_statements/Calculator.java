import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform : ");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.println("Addition of a & b is : " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction of a & b is : " + (a - b));
                break;
            case "*":
                System.out.println("Multiplication of a & b is : " + (a * b));
                break;
            case "/":
                System.out.println("Dividation of a & b is : " + (a / b));
                break;
            case "%":
                System.out.println("Modulo of a & b is : " + (a % b));
                break;
            default:
                System.out.println("Enter vaild operation");
        }
    }

}