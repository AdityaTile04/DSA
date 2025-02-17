public class SumOfN {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sunOfN = n + sum(n - 1);

        return sunOfN;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }   
}
