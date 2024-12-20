public class Solution {
    public static int lowerBound(int[] arr,int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}
