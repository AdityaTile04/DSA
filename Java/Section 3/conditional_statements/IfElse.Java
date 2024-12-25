public class IfElse {
    public static void main (String args[]) {
        int age = 12;

        if (age >= 18) {
            System.out.println("You can vote now");
        } 
        
        if(age > 13 && age < 18) {
            System.out.println("teeneger");
        }

        else {
            System.out.println("Your age is below 18");
        }
    }
}