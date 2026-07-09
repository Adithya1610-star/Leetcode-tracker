// Last updated: 7/9/2026, 9:16:15 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int target = 1;
        for (int n : nums) {
            if (n > 0 && n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }
        return target;
    }
}