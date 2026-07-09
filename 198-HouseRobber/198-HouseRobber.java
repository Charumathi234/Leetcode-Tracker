// Last updated: 7/9/2026, 3:08:45 PM
class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans =helper(nums,n-1,dp);
        return ans;
    }
    public int helper(int  nums[],int i, int dp[]){
        if(i<0) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int take =nums[i]+helper(nums,i-2,dp);
        int not =0+helper(nums,i-1,dp);
        int ans = Math.max(take,not);
        dp[i]=ans;
        return ans;
    }
}