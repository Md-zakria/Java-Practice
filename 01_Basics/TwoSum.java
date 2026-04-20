import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // store number -> index as we go
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numWeNeed = target - nums[i];

            // if we already saw the number we need, we found our pair
            if (seen.containsKey(numWeNeed)) {
                return new int[]{seen.get(numWeNeed), i};
            }

            // otherwise save this number for later
            seen.put(nums[i], i);
        }

        // problem guarantees a solution exists so we won't reach here
        return new int[]{};
    }
}
