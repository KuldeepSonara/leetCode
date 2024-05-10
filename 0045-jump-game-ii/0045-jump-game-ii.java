class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int cover = 0, lastJumpIndex = 0;

        if(nums.length == 1) return 0;

        for( int i = 0; i < nums.length -1 ; i++){
            cover = Math.max(cover, i + nums[i]);

            if(i==lastJumpIndex){
                lastJumpIndex = cover;
                jumps++;
            }

            if (i >= nums.length - 1) {
                break; // Add a break to prevent unnecessary iterations beyond the array length
            }
        }

        return jumps;
    }
}