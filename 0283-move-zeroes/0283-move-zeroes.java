class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroindex = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeroindex++] = nums[i];
            }
        }

        for(int i=nonZeroindex; i<nums.length; i++){
            nums[i]=0;
        }
    }
}