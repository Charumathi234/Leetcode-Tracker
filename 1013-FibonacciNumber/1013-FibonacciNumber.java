// Last updated: 7/9/2026, 3:06:51 PM
class Solution {
    public int fib(int n) {
        int a =0;
        int b =1; 
        int c =0;
        if(n==0)  return 0;
        if(n==1) return 1;
        for(int i=1;i<=n;i++){
           a = b;
           b = c;
           c =a+b;
        }
        return c;
    }
}