class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Convert wordDict to a HashSet for O(1) lookup time
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        // Find the maximum length of the words in the dictionary
        int max_len = 0;
        for (String word : wordDict) {
            max_len = Math.max(max_len, word.length());
        }

        // Iterate through the string s
        for (int i = 1; i <= n; i++) {
            // Check substrings ending at position i
            for (int j = i - 1; j >= Math.max(i - max_len, 0); j--) {
                // If the substring s[j:i] is in the wordSet and dp[j] is true,
                // set dp[i] to true
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        // The result is whether we can segment the entire string
        return dp[n];
    }
}