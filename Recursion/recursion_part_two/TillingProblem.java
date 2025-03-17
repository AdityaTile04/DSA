public class TillingProblem {

    public static int tillingProblem(int n) { // floor's length

        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        int verticalChoice = tillingProblem(n - 1);
        int horizontalChoice = tillingProblem(n - 2);

        int totalWays = verticalChoice + horizontalChoice;
        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tillingProblem(3));
    }
}