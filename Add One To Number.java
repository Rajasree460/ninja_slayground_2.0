import java.util.*; 

public class Solution {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
              // Reverse traversal from the least significant digit
        int n = arr.size();
        int carry = 1;  // We need to add 1 to the number
        
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);  // Update the current digit
            carry = sum / 10;  // Compute the carry
        }
        
        // If there's still a carry left, prepend it to the array
        if (carry > 0) {
            arr.add(0, carry);
        }
        
        // Remove leading zeros if present
        while (arr.size() > 1 && arr.get(0) == 0) {
            arr.remove(0);
        }
        
        return arr;
    }
}
