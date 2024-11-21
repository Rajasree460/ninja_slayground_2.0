public class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers <= 1 are not prime
        }

        for (int i = 2; i * i <= n; i++) { // Check divisors up to sqrt(n)
            if (n % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // If no divisors are found, it's prime
    }

    public static void main(String[] args) {
        int n = 5; // Replace with input value
        boolean ans = isPrime(n);

        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
