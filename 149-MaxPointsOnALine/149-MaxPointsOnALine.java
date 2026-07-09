// Last updated: 7/9/2026, 3:10:06 PM

class Solution {
    public int maxPoints(int[][] points) {

        if (points.length <= 2)
            return points.length;

        int ans = 0;

        for (int i = 0; i < points.length; i++) {

            HashMap<String, Integer> map = new HashMap<>();
            int duplicate = 1;

            for (int j = i + 1; j < points.length; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                // Same point
                if (dx == 0 && dy == 0) {
                    duplicate++;
                    continue;
                }

                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;

                // Normalize sign
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                } else if (dx == 0) {
                    dy = 1;      // Vertical line
                } else if (dy == 0) {
                    dx = 1;      // Horizontal line
                }

                String key = dx + "," + dy;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            int max = 0;
            for (int val : map.values()) {
                max = Math.max(max, val);
            }

            ans = Math.max(ans, max + duplicate);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }
}