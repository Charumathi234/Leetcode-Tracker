// Last updated: 7/9/2026, 3:11:49 PM
class Solution {
    public boolean isPalindrome(int x) {
         if(x<0) return false;
        int rev =0;
        int og =x;
        while(x!=0){
            int d=x%10;
            rev = rev*10+d;
            x =x/10;
        }
        return og==rev;
    }
}