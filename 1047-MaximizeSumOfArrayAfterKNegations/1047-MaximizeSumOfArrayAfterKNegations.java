// Last updated: 7/9/2026, 9:14:07 AM
import java.util.Arrays;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, Math.abs(num));
        }
        if (k % 2 == 1) {
            sum -= 2 * min;
        }
        return sum;
    }
}