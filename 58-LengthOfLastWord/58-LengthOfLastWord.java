// Last updated: 7/9/2026, 3:10:54 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
    int count = 0;
    while (i >= 0 && s.charAt(i) != ' ') {
        count++;
        i--;
     }
     return count;
    }
}
