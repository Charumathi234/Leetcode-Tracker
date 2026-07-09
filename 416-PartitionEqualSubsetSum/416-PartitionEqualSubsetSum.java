// Last updated: 7/9/2026, 3:07:34 PM
 class Solution {
    public boolean canPartition(int[] nums) {
        int n =nums.length;
        int sum =0;
        for(int num:nums){
            sum+=num;
        }
      
        if(sum%2!=0){
             return false;
        }  
        int m= sum / 2;
        Boolean[][] dp = new Boolean[n + 1][m + 1];

         return subset(nums,n,m,dp);
    }
    public boolean subset(int nums[],int n,int m,Boolean[][] dp){
        if(dp[n][m]!=null){
            return dp[n][m];
        }
        if(m==0) return true;
        if(n==0) return false;
        boolean take = false;

        if(nums[n-1]<=m){
            take = subset(nums,n-1,m-nums[n-1],dp);
        }
           boolean notTake =subset(nums,n-1,m,dp);
            return dp[n][m]=take || notTake;
    }
}