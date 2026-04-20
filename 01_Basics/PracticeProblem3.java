public class PracticeProblem3 {
    public int maxSubArray(int[] nums) {
        // start with the first element
        int bestSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // either extend the current subarray or start fresh from here
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // update best if current is better
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
    }
}
