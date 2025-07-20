public class Operations {
    // to get ith bit
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // to set ith bit
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // to clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // approach 1
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        // approach 2
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(5, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(5, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(8, 2));
        System.out.println(clearBitsInRange(5, 2, 3));
    }
}
