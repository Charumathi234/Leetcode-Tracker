// Last updated: 7/9/2026, 3:06:36 PM
class Solution {
    public int minInsertions(String s) {
        int m =s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int n =rev.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = helper(s,rev,m,n,dp);
        return m-ans;
    }
    public int helper(String ch1,String ch2,int m,int n,int dp[][]){
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(m==0 ||n==0) return 0;
        if(ch1.charAt(m-1)==ch2.charAt(n-1)){
             return dp[m][n] = 1 + helper(ch1, ch2, m - 1, n - 1, dp);
        }
        int x = helper(ch1,ch2,m-1,n,dp);
        int y =helper(ch1,ch2,m,n-1,dp);
        dp[m][n]=Math.max(x,y);
        return dp[m][n];
    }
}