package Array.operation_in_arrays;

public class MaxSubArray {

    public static void maxSubarraySum(int n[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += n[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6 };
        maxSubarraySum(n);
    }
}