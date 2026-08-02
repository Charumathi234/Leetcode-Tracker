// Last updated: 8/2/2026, 8:56:33 AM
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3        int ans =0;
4        int n =nums.length;
5        for(int i=0;i<n;i++){
6            int even =0;
7            int odd =0;
8            for(int j=i;j<n;j++){
9                if(nums[j]%2==0)
10                    even++;
11                else
12                    odd++;
13                if(odd>0 &&(long)even*b<=(long)odd*a){
14                    ans++;
15                }
16            }
17        }
18        return ans;
19    }
20}