// Last updated: 7/9/2026, 3:05:18 PM
class Solution {
    public int findClosest(int x, int y, int z) {
       int n1=Math.abs(x-z);
       int n2=Math.abs(y-z);
       if(n1<n2) return 1;
       if(n2<n1) return 2;
        else return 0;
    }    
}