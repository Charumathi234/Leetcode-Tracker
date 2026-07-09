// Last updated: 7/9/2026, 3:05:15 PM
class Solution {
    public int maxDistance(String moves) {
        int x =0;
        int y=0;
        int b=0;
        for(char c : moves.toCharArray()){
            if(c=='U') y++;
            else if(c=='D') y--;
            else if(c=='L') x--;
            else if(c=='R') x++;
            else b++;
        }
        return Math.abs(x)+Math.abs(y)+b;
    }
}