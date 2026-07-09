// Last updated: 7/9/2026, 9:14:11 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int c=nums[i]*nums[i];
             a[k++]=c;
        }
        Arrays.sort(a);
        return a;
    }
}