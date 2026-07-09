// Last updated: 7/9/2026, 3:08:14 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int m = n/3;
        List <Integer> p = new ArrayList<>();
        for(Map.Entry <Integer , Integer> en : mp.entrySet()){
            if(en.getValue()>m){
                 p.add(en.getKey());
            }
        }
        return p;
    }
}