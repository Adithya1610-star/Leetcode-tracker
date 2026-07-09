// Last updated: 7/9/2026, 9:14:04 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr) {
            count.merge(a, 1, Integer::sum);
        }
        Set<Integer> seen = new HashSet<>();
        for (int freq : count.values()) {
            if (!seen.add(freq)) {
                return false;
            }
        }
        return true;
    }
}