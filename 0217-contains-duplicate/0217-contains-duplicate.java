import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(final int[] nums) {
        HashSet<Integer> haseset = new HashSet<>();
        final int length = nums.length;
       if (length == 1)
            return false;
        if (length == 2)
            return nums[0] == nums[1];

        for(int i=0; i<length; i++){
            if(haseset.contains(nums[i])){
                return true ;
            }
            haseset.add(nums[i]);
        }
        return false;
    }
}