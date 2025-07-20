public class PowerOfN {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xmn1 = power(x, n - 1);
        int xn = x * xmn1;

        return xn;

    }

    public static int optimizedPower(int x, int n) {
        if (n == 0)
            return 1;

        int halpPower = optimizedPower(x, n / 2);
        int hpsq = halpPower * halpPower;

        if (n % 2 != 0) {
            hpsq = x * hpsq;
        }

        return hpsq;

    }

    public static void main(String args[]) {
        System.out.println(power(5, 2));
        System.out.println(optimizedPower(2, 5));
    }
}
