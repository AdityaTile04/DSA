public class BinaryToDecimal {

    public static void binaryToDecimal(int n) {
        int myNum = n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + myNum + " is : " + dec);
    }

    public static void main(String args[]) {
        binaryToDecimal(1010);
    }
}