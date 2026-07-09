// Last updated: 7/9/2026, 9:15:50 AM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; int result = 0;
       for (int num : nums)
       {
           if (count == 0) result = num;
           if (result != num) count--; else count++;                   
       }
       return result;
    }
}