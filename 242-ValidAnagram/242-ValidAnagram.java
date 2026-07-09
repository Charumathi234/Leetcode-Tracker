// Last updated: 7/9/2026, 3:08:04 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] CharArrayS=s.toCharArray();
        char[] CharArrayT =t.toCharArray();
        Arrays.sort(CharArrayS);
        Arrays.sort(CharArrayT);
        return Arrays.equals(CharArrayS,CharArrayT);
    }
}