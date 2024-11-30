public class Solution {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid to prevent overflow
            
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] > target) {
                high = mid - 1; // Search the left half
            } else {
                low = mid + 1; // Search the right half
            }
        }

        return -1; // Target not found
    }
}
