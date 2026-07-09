// Last updated: 7/9/2026, 3:05:16 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String rev ="";
        int i=k-1;
     while(i>=0){
         rev =rev+s.charAt(i);
         i--;
     }
        for(int j=k;j<s.length();j++){
            rev =rev+s.charAt(j);
        }
        return rev;
    }
}