// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> freq = new HashMap<>();
        long res=0;
        for(int[] r:rectangles){
            double ratio =(double)r[0]/r[1];
            res=res+freq.getOrDefault(ratio,0);
            freq.put(ratio,freq.getOrDefault(ratio,0)+1);
        }
        return res;
    }
}