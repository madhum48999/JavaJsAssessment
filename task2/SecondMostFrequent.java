package task2;

public class SecondMostFrequent {
    public static void main(String[] args) {
        String str = "successes";
        System.out.println("String: " + str);
        char c = getSecondMostFreq(str);
        if (c != '\0')
            System.out.println("Second most frequent char: " + c);
        else
            System.out.println("No second most frequent character found.");
    }

    public static char getSecondMostFreq(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int first = -1, second = -1;
        for (int i = 0; i < 256; i++) {
            if (first == -1 || count[i] > count[first]) {
                second = first;
                first = i;
            } else if (count[i] > 0 && count[i] != count[first]) {
                if (second == -1 || count[i] > count[second]) {
                    second = i;
                }
            }
        }
        return (second != -1) ? (char) second : '\0';
    }
}
