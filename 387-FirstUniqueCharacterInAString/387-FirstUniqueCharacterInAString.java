// Last updated: 7/9/2026, 3:07:44 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            int idx =s.charAt(i)-97;
            freq[idx]++;
        }
        for(int i=0;i<s.length();i++){
            int idx =s.charAt(i)-97;
            if(freq[idx]==1) return i;
        }
        return -1;
    }
}