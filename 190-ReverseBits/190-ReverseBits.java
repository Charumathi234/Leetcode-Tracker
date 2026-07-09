// Last updated: 7/9/2026, 3:08:52 PM
class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;          
            result |= (n & 1);    
            n >>>= 1;           
        }

        return result;
    }
}