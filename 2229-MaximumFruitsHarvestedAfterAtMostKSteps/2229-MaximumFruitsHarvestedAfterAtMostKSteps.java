// Last updated: 7/9/2026, 3:06:04 PM
class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
         int n = fruits.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + fruits[i][1];
        }

        int ans = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            while (left <= right &&
                   minSteps(fruits[left][0],
                            fruits[right][0],
                            startPos) > k) {
                left++;
            }

            ans = (int)Math.max(ans,
                    prefix[right + 1] - prefix[left]);
        }

        return ans;
    }

    private int minSteps(int left,
                         int right,
                         int startPos) {

        if (right <= startPos)
            return startPos - left;

        if (left >= startPos)
            return right - startPos;

        return Math.min(
                2 * (startPos - left) + (right - startPos),
                2 * (right - startPos) + (startPos - left)
        );
    }
}