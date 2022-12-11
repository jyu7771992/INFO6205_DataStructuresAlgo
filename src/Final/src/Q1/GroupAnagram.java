package Q1;

import java.util.*;

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if (strs.length == 0) return new ArrayList();
        //create map to store the string and list
        Map<String, List> res = new HashMap<String, List>();
        int[] count = new int[26];

        for (String s : strs) {
            // fill each value in the array
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;
            //create string
            StringBuilder stringBuilder = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                stringBuilder.append('#');
                stringBuilder.append(count[i]);
            }

            String idx = stringBuilder.toString();
            if (!res.containsKey(idx)) {
                res.put(idx, new ArrayList());
            }
            res.get(idx).add(s);
        }
        return new ArrayList(res.values());
    }
}
//Time Complexity: O(N * K) N = length of array, K = max length of string
//Space Complexity:O(N * K)

