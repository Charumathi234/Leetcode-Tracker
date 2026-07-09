// Last updated: 7/9/2026, 3:07:04 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && temp[i] > temp[s.peek()]) {
                int pDay = s.pop();
                ans[pDay] = i - pDay;
            }
            s.push(i);
        }
        return ans;
    }
}