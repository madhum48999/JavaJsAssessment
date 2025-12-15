package task2;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Checking " + s1 + " and " + s2);
        if (areAnagrams(s1, s2)) {
            System.out.println("They are Anagrams.");
        } else {
            System.out.println("They are NOT Anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s1.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!counts.containsKey(c))
                return false;
            counts.put(c, counts.get(c) - 1);
            if (counts.get(c) == 0) {
                counts.remove(c);
            }
        }
        return counts.isEmpty();
    }
}
