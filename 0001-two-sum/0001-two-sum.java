import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        Map<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int diff = target - n;
            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(n, i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}
