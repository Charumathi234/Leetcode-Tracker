// Last updated: 7/9/2026, 3:05:13 PM
class Solution {
    public int maxDigitRange(int[] nums) {
       int maxR = -1;
        int sum=0;
        for(int num:nums){
            int t=num;
            int maxD=0;
            int minD=9;
            if(t==0){
                minD=0; 
            }
            while(t>0){
                int d=t%10;
                maxD = Math.max(maxD,d);
                minD = Math.min(minD,d);
                t/=10;
            }
            int r =maxD-minD;
            maxR = Math.max(maxR,r);
        }
        for(int num:nums){
            int t = num;
            int maxD=0;
            int minD=9;
            if(t==0){
                maxD=0;
                minD=0;
            }
            while(t>0){
                int d =t%10;
                maxD= Math.max(maxD,d);
                minD = Math.min(minD,d);
                t/=10;
            }
            int r = maxD-minD;
            if(r==maxR){
               sum+=num; 
            }
        }
        return sum;
    }
}