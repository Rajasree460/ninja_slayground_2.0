import java.util.Arrays;
public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Sort the array
        Arrays.sort(a);
        
        // Retrieve the second smallest and second largest elements
        int secondSmallest = a[1];
        int secondLargest = a[n - 2];
        
        // Return the result
        return new int[]{secondLargest, secondSmallest};
    }
}
