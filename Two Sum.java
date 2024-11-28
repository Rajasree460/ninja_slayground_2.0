public class Solution {
    public static String read(int n, int []book, int target){
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(book[i]+book[j]==target){
                   return "YES";
                }
            }
        }
        return "NO";
    }
}
