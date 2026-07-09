// Last updated: 7/9/2026, 9:16:40 AM
class Solution {
    int reverse(int x) {
        long rev=0;
        while(x!=0){
        int temp=x%10;
        x=x/10;
        rev=rev*10+temp;
        }
        if(rev<Integer.MIN_VALUE|| rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int )rev;
    }
}