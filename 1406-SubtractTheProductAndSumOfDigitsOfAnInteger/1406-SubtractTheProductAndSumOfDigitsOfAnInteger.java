// Last updated: 7/9/2026, 3:06:37 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0 ;
        int product=1;
        while(n!=0){
          int num=n%10;
          product=product*num;
          sum+=num;
          n=n/10;
       }
       return product-sum;
    }
}