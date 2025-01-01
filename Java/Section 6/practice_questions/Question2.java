import java.util.*;

public class Question2 {

	public static boolean isEven(int n) {
			
		if(n % 2 == 0) {
			
		return true;
	}
	return false;
		
}

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");

	int n = sc.nextInt();
	boolean isEven = isEven(n);
	
	System.out.println(isEven);

	}
}