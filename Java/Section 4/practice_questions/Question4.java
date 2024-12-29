import java.util.*;

public class Question4 {

	public static void main (String arsg[]	) {
	
	Scanner sc = new Scanner(System.in);
	
	
	int evenSum = 0;
	int oddSum = 0;

	while(true) {
		
	System.out.println("Enter the number : ");
	int n = sc.nextInt();

	if(n == 0) {
		break;
	}
	
		if(n % 2 == 0) {
			evenSum += n;
		} else {
		
			oddSum += n;
				
}	
		
	}	

	System.out.println("The sum of even number is : " + evenSum);
	System.out.println("The sum of odd number is : " + oddSum);	

	}
}