// Last updated: 7/9/2026, 3:07:01 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                    break; // stop checking once matched
                }
            }
        }

        return count;
        
    }
}