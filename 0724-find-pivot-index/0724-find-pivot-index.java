class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int totalleft = 0;

        for(int ele : nums){
            total += ele;
        }

        for(int i = 0; i<nums.length; i++){
            int totalright = total - totalleft - nums[i];
            if(totalright == totalleft){
                return i;
            }

            totalleft += nums[i];
        }
        return -1;
    }
}