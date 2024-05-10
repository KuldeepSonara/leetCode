class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        if (nums.length<2) {
            return true;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
