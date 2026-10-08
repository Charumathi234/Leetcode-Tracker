// Last updated: 10/8/2026, 10:09:56 AM
1class Solution {
2    public String destCity(List<List<String>> paths) {
3        HashSet<String> start = new HashSet<>();
4        for (List<String> path : paths) {
5            start.add(path.get(0));
6        }
7        for (List<String> path : paths) {
8            String destination = path.get(1);
9
10            if (!start.contains(destination)) {
11                return destination;
12            }
13        }
14        return "";
15    }
16}