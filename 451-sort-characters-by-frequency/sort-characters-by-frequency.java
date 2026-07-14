import java.util.*;

class Solution {
    public String frequencySort(String s) {

        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Store unique characters in a list
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency (descending)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Build the answer
        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            int freq = map.get(ch);
            while (freq-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}