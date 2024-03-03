class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        if (nums1.length > nums2.length) {
            return kthSmallestProduct(nums2, nums1, k);
        }
        
        long left = (long)-1e10;
        long right = (long)1e10;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long count = getSmallerOrEqual(nums1, nums2, mid);
            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    private long getSmallerOrEqual(int[] nums1, int[] nums2, long t) {
        long res = 0;
        
        if (t >= 0) {
            int j1 = nums2.length - 1;
            int j2 = nums2.length - 1;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] > 0) {
                    while (j1 >= 0 && (long)nums1[i] * (long)nums2[j1] > t) {
                        j1--;
                    }
                    res += j1 + 1;
                } else if (nums1[i] == 0) {
                    res += nums2.length;
                } else {
                    while (j2 >= 0 && (long)nums1[i] * (long)nums2[j2] <= t) {
                        j2--;
                    }
                    res += nums2.length - j2 - 1;
                }
            }
        } else {
            int j1 = 0;
            int j2 = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] > 0) {
                    while (j1 < nums2.length && (long)nums1[i] * (long)nums2[j1] <= t) {
                        j1++;
                    }
                    res += j1;
                } else if (nums1[i] == 0) {
                    res += 0;
                } else {
                    while (j2 < nums2.length && (long)nums1[i] * (long)nums2[j2] > t) {
                        j2++;
                    }
                    res += nums2.length - j2;
                }
            }
        }
        return res;
    }
}