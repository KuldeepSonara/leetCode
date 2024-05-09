class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int uniqIndex = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count <= 2){
                    nums[uniqIndex] = nums[i];
                    uniqIndex++;
                }
            }
            else{
                count = 1;
                nums[uniqIndex] = nums[i];
                uniqIndex++;
            }
        }

        return uniqIndex;
    }
}