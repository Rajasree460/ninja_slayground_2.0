public class Solution {
    public static int reverseNumber(int n) {
        int rev=0,rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
