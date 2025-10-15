import java.util.Arrays;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";
        int n = s.length();

        int[][] dp = new int[n][n];
        for (int[] row : dp)
            Arrays.fill(row, -1); // -1 = uncomputed

        int maxLen = 0;
        int sp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalin(s, i, j, dp)) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp + maxLen);
    }

    private boolean isPalin(String s, int i, int j, int[][] dp) {
        if (dp[i][j] != -1)
            return dp[i][j] == 1;
        if (i >= j) {
            dp[i][j] = 1;
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            dp[i][j] = 0;
            return false;
        }
        if (isPalin(s, i + 1, j - 1, dp)) {
            dp[i][j] = 1;
            return true;
        } else {
            dp[i][j] = 0;
            return false;
        }
    }
}