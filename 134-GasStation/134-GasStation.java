// Last updated: 7/9/2026, 3:10:16 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        int st=0;
        for(int i=0; i<gas.length;i++){
            tg +=gas[i]-cost[i];
            tc +=gas[i]-cost[i];   
            if(tc<0){
                st=i+1;
                tc =0;
            }
        }
        if (tg<0){
        return -1;
        }
        return st; 
    }
}