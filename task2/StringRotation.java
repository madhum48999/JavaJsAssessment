package task2;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (checkRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
    }

    public static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
    }
}
