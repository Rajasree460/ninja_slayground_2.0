public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        return mergeSortAndCount(a, 0, n - 1);
    }

    public static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);

            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    public static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = java.util.Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = java.util.Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left, swaps = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (leftArr.length - i); 
            }
        }

        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }

        return swaps;
    }
}