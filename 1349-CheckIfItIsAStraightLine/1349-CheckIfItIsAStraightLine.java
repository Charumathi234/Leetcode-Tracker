// Last updated: 7/9/2026, 3:06:40 PM
class Solution {
    public boolean checkStraightLine(int[][] coor) {
        int x =coor[0][0];
        int y =coor[0][1];
        int x1=coor[1][0];
        int y1=coor[1][1];
        for(int i =2;i<coor.length;i++){
            int x2=coor[i][0];
            int y2=coor[i][1];
            if(((x-x1)*(y2-y1))!=((y-y1)*(x2-x1))) return false;
        }
        return true;
    }
}