class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // If all digits were 9, we need to create a new array with an additional digit.
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Set the first digit to 1
        return result;
    }
}
