// Last updated: 7/9/2026, 9:14:48 AM
class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        while (n >= rows + 1) {
            rows++;
            n -= rows;
        }
        return rows;
    }
}