// Last updated: 7/9/2026, 3:06:47 PM
class Solution {
    public int tribonacci(int n) {
        int a =0;
        int b=1;
        int c =1;
        int d =0;
       if(n==0)  return 0;
       if(n==1)  return 1;
       if(n==2) return 1;
        for(int i=1;i<=n-2;i++){
            d =a+b+c;
            a = b;
            b =c;
            c = d;
        }
        return d;
    }
}