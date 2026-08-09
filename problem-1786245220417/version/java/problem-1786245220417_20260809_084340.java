// Last updated: 8/9/2026, 8:43:40 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double total=0;
6        int j =discounts.length-1;
7        for(int i=prices.length-1;i>=0;i--){
8            if(j>=0){
9                total+=prices[i]*(100.0-discounts[j])/100.0;
10                j--;
11            }else{
12                total+=prices[i];
13            }
14        }
15        return total;
16    }
17}