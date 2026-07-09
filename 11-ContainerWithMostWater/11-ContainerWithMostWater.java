// Last updated: 7/9/2026, 3:11:46 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int ans =0;
        int j=height.length-1;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int w =j-i;
            int area=h*w;
            if(area>ans){
                ans = area;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        } 
        return ans;
    }
}