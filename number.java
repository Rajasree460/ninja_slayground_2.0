//brute force

// public class Solution {
//     public static int countDigits(int n){
//         int ct=0;
//         while(n>0){
//             n/=10;
//             ct++;
//         }
//         return ct;
//     }
// }

public class Solution {
    public static int countDigits(int n) {
        // Using mathematical approach: log10(n) + 1 gives the number of digits in n
        return (int)Math.log10(n) + 1;
    }
}
