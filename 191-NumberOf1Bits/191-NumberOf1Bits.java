// Last updated: 7/9/2026, 9:15:31 AM
class Solution {
    public int hammingWeight(int n) {
       int j=0;
       while(n>0){
        j=n%2+j;
        n=n/2;
       }
       return j;
    }
}