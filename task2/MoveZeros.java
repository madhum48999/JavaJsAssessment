package task2;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        System.out.println("Original: " + Arrays.toString(arr));

        moveZeros(arr);

        System.out.println("Result: " + Arrays.toString(arr));
    }

    public static void moveZeros(int[] arr) {
        if (arr == null)
            return;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
