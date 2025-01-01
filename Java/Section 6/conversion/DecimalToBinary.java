public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        int myNum = n;
        int pow = 0;
        int bin = 0;

        while (n > 0) {
            int remainder = n % 2;
            bin = bin + (remainder * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("Binary of " + myNum + " is :  " + bin);
    }

    public static void main(String args[]) {
        decimalToBinary(7);
    }
}

