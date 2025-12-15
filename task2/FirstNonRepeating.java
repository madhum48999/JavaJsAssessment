package task2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 9, 6, 7, 4 };
        findFirstNonRepeating(arr);
    }

    public static void findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating element: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating element found.");
    }
}
