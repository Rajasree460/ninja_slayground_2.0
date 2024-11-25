public class Solution {
    public static int calcGCD(int n, int m){
        while(m!=0){
            if(n>m){
                n=n-m;
            }else{
            m=m-n;
            }
        }
        return n;
    }
}
