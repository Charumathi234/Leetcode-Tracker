// Last updated: 7/9/2026, 3:06:53 PM
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long MOD = 1000000007;
        long ans = 0;
        long[] freq = new long[101];
        for(int num : arr) {
            freq[num]++;
        }
        for(int x = 0; x <= 100; x++) {
            for(int y = x; y <= 100; y++) {
                int z = target - x - y;
                if(z < 0 || z > 100)
                    continue;
                if(z < y)
                    continue;
                if(x == y && y == z) {
                    ans += freq[x] *
                           (freq[x]-1) *
                           (freq[x]-2) / 6;
                }
                else if(x == y) {
                    ans += (freq[x] *
                           (freq[x]-1) / 2)
                           * freq[z];
                }
                else if(y == z) {
                    ans += freq[x] *
                           (freq[y] *
                           (freq[y]-1) / 2);
                }
                else {
                    ans += freq[x] *
                           freq[y] *
                           freq[z];
                }
                ans %= MOD;
            }
        }
        return (int)ans;
    }
}