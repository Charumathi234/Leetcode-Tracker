// Last updated: 7/9/2026, 3:06:14 PM
class Solution {
    public int arraySign(int[] nums) {
        int negcount= 0;
         for(int x :nums){
            if(x==0) return 0;
            if(x<0) negcount++;     
        }
         return (negcount%2==0)?1:-1;
    }
}