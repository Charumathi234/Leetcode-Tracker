// Last updated: 7/9/2026, 3:08:29 PM
class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        String str = s + "#" + rev;

        int[] lps = new int[str.length()];

        for (int i = 1; i < str.length(); i++) {
            int j = lps[i - 1];

            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lps[j - 1];
            }

            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }

            lps[i] = j;
        }

        int longestPrefix = lps[str.length() - 1];

        return rev.substring(0, s.length() - longestPrefix) + s;
        
    }
}