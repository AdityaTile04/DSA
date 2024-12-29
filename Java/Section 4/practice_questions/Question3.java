import java.util.*;

public class Question3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("Factorial in not for negative numbers");
		} else {

			long factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial *= i;

			}

			System.out.println("The factorial of " + n + " is : " + factorial);
		}

	}
}