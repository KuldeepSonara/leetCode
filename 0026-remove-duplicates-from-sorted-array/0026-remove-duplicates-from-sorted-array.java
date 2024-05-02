class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null){
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length == 0) {
            return 0; // Empty array has no duplicates
        }
        int uniqIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[uniqIndex]){
                uniqIndex++;
                nums[uniqIndex] = nums[i];
            }
        }

        return uniqIndex+1;
    }
}