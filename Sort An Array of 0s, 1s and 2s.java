import java.util.ArrayList;

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Initialize pointers
        int low = 0, mid = 0, high = n - 1;
        
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // Swap arr[low] and arr[mid], then increment low and mid
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                // Move mid pointer forward
                mid++;
            } else {
                // Swap arr[mid] and arr[high], then decrement high
                int temp = arr.get(high);
                arr.set(high, arr.get(mid));
                arr.set(mid, temp);
                high--;
            }
        }
    }
}
