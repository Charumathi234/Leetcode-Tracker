// Last updated: 10/1/2026, 3:11:28 PM
1class Solution {
2    public String mostCommonWord(String paragraph, String[] banned) {
3        paragraph = paragraph.toLowerCase();
4
5        String[] words = paragraph.split("[^a-z]+");
6
7        HashSet<String> ban = new HashSet<>();
8
9        for (String word : banned) {
10            ban.add(word);
11        }
12
13        HashMap<String, Integer> map = new HashMap<>();
14
15        String answer = "";
16        int max = 0;
17
18        for (String word : words) {
19
20            if (ban.contains(word)) {
21                continue;
22            }
23
24            int count = map.getOrDefault(word, 0) + 1;
25            map.put(word, count);
26
27            if (count > max) {
28                max = count;
29                answer = word;
30            }
31        }
32
33        return answer;
34    }
35}