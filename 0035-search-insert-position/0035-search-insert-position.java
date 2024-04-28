class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        if(target<=nums[0]) return 0;
        for(int i=1; i<l ; i++){
            if(nums[i] == target){
                return i;
            }
            if(target > nums[i-1] && target < nums[i]){
                return i;
            }
        }

        return l;
    }
}