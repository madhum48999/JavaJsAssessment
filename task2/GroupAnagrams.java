package task2;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println("Input: " + Arrays.toString(words));

        groupAnagrams(words);
    }

    public static void groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        System.out.println("Grouped Anagrams: " + map.values());
    }
}
