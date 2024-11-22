public class Solution {
    public static int isSorted(int n, int[] a) {
        // Traverse the array and check if the elements are in non-decreasing order
        for (int i = 1; i < n; i++) {
            // If the current element is smaller than the previous element, array is not sorted
            if (a[i] < a[i - 1]) {
                return 0; // Not sorted
            }
        }
        return 1; // Sorted
    }
}
