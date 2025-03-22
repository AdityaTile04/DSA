public class FriendsPairingProblem {

    public static int friendsPairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        int single = friendsPairing(n - 1);
        int pairs = friendsPairing(n - 2);

        int ways = single += single * pairs;

        return ways;
    }

    public static void main(String args[]) {
        System.out.println(friendsPairing(4));
    }
}
