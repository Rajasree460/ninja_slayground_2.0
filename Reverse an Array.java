public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        int[] arrnw=new int[n];
        for(int i=0;i<n;i++){
            arrnw[i]=nums[n-1-i];
        }
        return arrnw;
    }
}
