// Last updated: 8/5/2026, 9:02:44 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        HashMap<String, Integer> map = new HashMap<>();
4        for (int i = 0; i < list1.length; i++) {
5            map.put(list1[i], i);
6        }
7
8        List<String> result = new ArrayList<>();
9        int minSum = Integer.MAX_VALUE;
10
11        for (int j = 0; j < list2.length; j++) {
12            if (map.containsKey(list2[j])) {
13                int sum = j + map.get(list2[j]);
14
15                if (sum < minSum) {
16                    result.clear();
17                    result.add(list2[j]);
18                    minSum = sum;
19                } else if (sum == minSum) {
20                    result.add(list2[j]);
21                }
22            }
23        }
24
25        return result.toArray(new String[0]);
26    }
27}