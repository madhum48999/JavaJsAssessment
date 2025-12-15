package task2;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };

        System.out.print("Intersection: ");
        findIntersection(arr1, arr2);
    }

    public static void findIntersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                System.out.print(nums1[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
    }
}
