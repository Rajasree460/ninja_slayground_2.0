import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Read the input value for n
        int n = sc.nextInt();

        // Call the function to get the n-th Fibonacci number
        int result = findFibonacci(n);

        // Print the result
        System.out.println(result);

        // Close the scanner
        sc.close();
    }

    public static int findFibonacci(int n) {
        // Handle edge cases for n = 1 or n = 2
        if (n == 1 || n == 2) {
            return 1;
        }

        // Initialize the first two Fibonacci numbers
        int prev1 = 1; // F(1)
        int prev2 = 1; // F(2)
        int current = 0;

        // Calculate Fibonacci numbers iteratively
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current; // Return the n-th Fibonacci number
    }
}
