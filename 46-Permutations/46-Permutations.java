// Last updated: 7/9/2026, 3:11:03 PM
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutations(0,nums);
        return ans;
    }
    public void  permutations(int i, int nums[]){
        if(i==nums.length-1){
            List<Integer> temp = new ArrayList<>();
            for(int k=0;k<nums.length;k++){
                temp.add(nums[k]);
            }
            ans.add(temp);
        }
            for(int j=i;j<nums.length;j++){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            permutations(i+1,nums);
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
         }
      
    }
}