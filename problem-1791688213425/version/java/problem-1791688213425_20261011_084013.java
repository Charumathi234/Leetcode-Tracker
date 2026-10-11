// Last updated: 10/11/2026, 8:40:13 AM
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        List<Integer> ans = new ArrayList<>();
4        boolean[] prime = new boolean[n+1];
5        Arrays.fill(prime,true);
6        if(n>=0) prime[0]=false;
7        if(n>=1)prime[1]=false;
8        for(int i=2;i*i<=n;i++){
9            if(prime[i]){
10                for(int j=i*i;j<=n;j+=i){
11                prime[j]=false;
12                }
13            }
14        }
15        
16            for(int i=2;i<=n;i++){
17            if(prime[i] && i<=s){
18                ans.add(i);
19                s-=i;
20            }
21        }
22        return ans;
23    }
24}