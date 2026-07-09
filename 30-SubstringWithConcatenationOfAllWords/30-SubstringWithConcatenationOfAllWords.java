// Last updated: 7/9/2026, 3:11:15 PM
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
           List<Integer> result = new ArrayList<>();
        if (s == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalWords = words.length;
        int windowSize = wordLen * totalWords;

        Map<String, Integer> wordCount = new HashMap<>();

        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();

            for (int j = i; j + wordLen <= s.length(); j += wordLen) {
                String word = s.substring(j, j + wordLen);

                if (wordCount.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    while (seen.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == totalWords) {
                        result.add(left);
                    }

                } else {
                    seen.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }

        return result;
    }
}