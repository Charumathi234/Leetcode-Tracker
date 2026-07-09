// Last updated: 7/9/2026, 3:05:47 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0 ; 
        int d =0;
        for(int i:nums){
             sum =sum+i;
             int temp =i;
             while(temp>0){
                d +=temp%10;
                temp =temp/10;
             }
        }
        return Math.abs(sum-d);
    }
}