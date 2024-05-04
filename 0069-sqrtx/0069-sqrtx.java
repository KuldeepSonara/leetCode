class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 0;
        int end = x/2;
        int ans = 0;
        
        while(start <= end){
            long mid = (start + end) / 2;

            if(mid * mid == x){
                return (int)mid;
            }

            else if(mid * mid < x){
                start = (int)mid + 1;
                ans = (int)mid;
            }

            else{
            end = (int)mid - 1;
            }

        }

        return ans;
    }
}
