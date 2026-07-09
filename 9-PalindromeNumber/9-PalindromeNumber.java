// Last updated: 7/9/2026, 9:16:38 AM
class Solution {
    public boolean isPalindrome(int x) {
        int c=x;
        if(x<0){
            return false;
        }
        int temp=0;
        while(x!=0){
        int rev = x%10;
        x=x/10;
        temp=temp*10+rev;
    }

        return (c==temp);
}
}