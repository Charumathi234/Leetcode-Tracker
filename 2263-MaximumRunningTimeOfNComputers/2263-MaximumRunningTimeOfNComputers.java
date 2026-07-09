// Last updated: 7/9/2026, 3:06:01 PM
class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long total = 0;
        for (int b : batteries) {
            total += b;
        }

        long left = 0, right = total / n;
        while (left < right) {
            long mid = (left + right + 1) / 2;
            if (canRun(mid, n, batteries)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean canRun(long time, int n, int[] batteries) {
        long power = 0;
        for (int b : batteries) {
            power += Math.min(b, time);
        }
        return power >= time * n;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] batteries = {3, 3, 3};
        System.out.println(sol.maxRunTime(2, batteries)); // Output: 4
    }
}
    
