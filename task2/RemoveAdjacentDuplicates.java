package task2;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "abbaca";
        System.out.println("Input: " + input);
        System.out.println("Output: " + removeDuplicates(input));
    }

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
