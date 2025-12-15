package task2;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "This is a test. This is only a test.";
        System.out.println("Paragraph: " + paragraph);
        countFrequency(paragraph);
    }

    public static void countFrequency(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        if (str == null)
            return;

        String[] words = str.toLowerCase().split("\\W+");
        for (String w : words) {
            if (!w.isEmpty()) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        System.out.println("Word Frequencies: " + map);
    }
}
