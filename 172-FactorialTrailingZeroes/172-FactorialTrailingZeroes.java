// Last updated: 7/9/2026, 3:09:48 PM
class Solution {
    public int trailingZeroes(int n) {
        if(n==0) return 0;
        int count =0;
        while(n!=0){
            n =n/5;
            count = count+n;
        }
        return count;
    }
}