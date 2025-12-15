package task2;

import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3, 12, 20 };
        System.out.println("Array: " + Arrays.toString(arr));
        findMinDiff(arr);
    }

    public static void findMinDiff(int[] arr) {
        if (arr.length < 2)
            return;
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.print("Smallest Difference (" + minDiff + "). Pairs: ");
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == minDiff) {
                System.out.print("(" + arr[i - 1] + ", " + arr[i] + ") ");
            }
        }
        System.out.println();
    }
}
