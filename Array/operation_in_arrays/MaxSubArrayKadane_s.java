package Array.operation_in_arrays;

public class MaxSubArrayKadane_s {
    public static void max_Sub_Array_Using_Kadanes_algo(int n[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n.length; i++) {
            currSum = currSum + n[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max is : " + maxSum);
    }

    public static void main(String[] args) {
        int n[] = { -2, -1, 3, 6, 1 };
        max_Sub_Array_Using_Kadanes_algo(n);
    }
}
