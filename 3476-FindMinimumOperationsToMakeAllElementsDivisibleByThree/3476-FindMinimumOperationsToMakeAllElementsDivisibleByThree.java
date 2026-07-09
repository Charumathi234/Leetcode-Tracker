// Last updated: 7/9/2026, 3:05:23 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int operations =0;
        for(int num :nums){
            if(num%3!=0){
              operations++;
            }
        }
        return operations;
    }
}