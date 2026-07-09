// Last updated: 7/9/2026, 3:06:27 PM
class Solution {
    public int numWaterBottles(int nB, int nE) {
        int drink = nB;
        int empty =nB;
        while(empty >=nE){
            int newD = empty/nE;
            drink+=newD;
            empty=(empty%nE)+newD;
        }
        return drink;
    }
}