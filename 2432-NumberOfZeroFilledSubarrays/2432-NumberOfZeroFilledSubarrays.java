// Last updated: 7/9/2026, 9:13:59 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                c=0;
            }
            ans+=c;
        }
        return ans;
    }
}