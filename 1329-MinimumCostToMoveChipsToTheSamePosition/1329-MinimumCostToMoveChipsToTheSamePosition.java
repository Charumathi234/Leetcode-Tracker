// Last updated: 7/9/2026, 3:06:42 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
       int oddcount =0;
       int evencount=0;
       for(int x:position){
         if(x%2==0){
            evencount++;
         }else{
            oddcount++;
         }
       }
       return evencount<oddcount?evencount:oddcount;
    }
}