// Last updated: 7/9/2026, 3:05:55 PM
class Solution {
    public int averageValue(int[] nums) {
        int count =0;
        int sum =0;
        for(int i:nums){
           if(i%2==0 && i%3==0){
            sum =sum+i;
            count++;
           }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }
}