public class TernaryOperator {
    public static void main(String args[]) {
        int age = 15;
        String Age = (age >= 18) ? "ADULT" : "TEENEGER";
        System.out.println(Age);

        int n = 2;
        String evenOdd = ((n % 2) == 0) ? "EVEN" : "ODD";
        System.out.println(evenOdd);

        int marks = 60;
        String result = (marks >= 35) ? "PASS" : "FAIL";
        System.out.println(result);
    }
}
