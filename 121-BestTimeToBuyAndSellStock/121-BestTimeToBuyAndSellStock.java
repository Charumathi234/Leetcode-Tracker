// Last updated: 7/9/2026, 3:10:24 PM
class Solution {
    public int maxProfit(int[] prices) {
     int maxp=0;
     int bp=prices[0];
     for(int i=1;i<prices.length;i++){
        int sp=prices[i];
            if(sp>bp){
                int profit = sp-bp;
                 if(profit > maxp) maxp = profit;
            }else{
                bp =sp;
            }
        }
        return maxp;
    }
}