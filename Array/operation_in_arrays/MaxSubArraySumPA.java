package Array.operation_in_arrays;

public class MaxSubArraySumPA {
    public static void max_SubarraySum_Using_Prefix_Array(int n[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n.length];

        // prefix array
        prefix[0] = n[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + n[i];
        }
        for (int i = 0; i < n.length; i++) { // start
            int start = 0;
            for (int j = i; j < n.length; j++) { // end
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // currSum

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum : " + maxSum);
    }

    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 4, 5, 6 };
        max_SubarraySum_Using_Prefix_Array(n);
    }
}
