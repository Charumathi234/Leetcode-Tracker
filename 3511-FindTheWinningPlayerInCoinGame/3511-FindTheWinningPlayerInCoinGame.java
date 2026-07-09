// Last updated: 7/9/2026, 3:05:21 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int turn =1;
        while(x>=1 && y>=4){
            x-=1;
            y-=4;
            turn++;
        }
        return (turn%2==0)? "Alice":"Bob";
    }
}