// Last updated: 7/9/2026, 3:07:17 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        int ans = helper(word1,word2,m,n,dp);
        return ans;
    }
    public int helper(String ch1,String ch2,int m ,int n,int dp[][]){
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(m==0) return n;
        if(n==0) return m;
        if(ch1.charAt(m-1)==ch2.charAt(n-1)){
            int ans=0+helper(ch1,ch2,m-1,n-1,dp);
            return ans;
        }
        int x = 1+helper(ch1,ch2,m-1,n,dp);
        int y = 1+helper(ch1,ch2,m,n-1,dp);
        dp[m][n]=Math.min(x,y);
        return dp[m][n];
    }
}