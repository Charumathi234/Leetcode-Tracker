// Last updated: 7/9/2026, 3:06:28 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs =0;
        HashMap<Integer,Integer> freq =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            pairs+=freq.getOrDefault(nums[i],0);
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        return pairs;
    }
}