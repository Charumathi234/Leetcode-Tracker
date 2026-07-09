// Last updated: 7/9/2026, 3:06:31 PM
class Solution {

    int[] dp;
    int[] arr;
    int d;

    public int maxJumps(int[] arr, int d) {

        this.arr = arr;
        this.d = d;

        int n = arr.length;
        dp = new int[n];

        int ans = 1;

        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(i));
        }

        return ans;
    }

    private int dfs(int i) {

        if(dp[i] != 0)
            return dp[i];

        int max = 1;

        // Left
        for(int j = i - 1;
            j >= Math.max(0, i - d);
            j--) {

            if(arr[j] >= arr[i])
                break;

            max = Math.max(
                    max,
                    1 + dfs(j)
                  );
        }

        // Right
        for(int j = i + 1;
            j <= Math.min(arr.length - 1,
                          i + d);
            j++) {

            if(arr[j] >= arr[i])
                break;

            max = Math.max(
                    max,
                    1 + dfs(j)
                  );
        }

        dp[i] = max;

        return max;
    }
}