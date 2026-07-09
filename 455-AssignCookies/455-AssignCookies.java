// Last updated: 7/9/2026, 9:14:45 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = s.length - 1;
        int childIndex = g.length;
        while (cookieIndex >= 0 && --childIndex >=0)
            if (s[cookieIndex] >= g[childIndex]) cookieIndex--;
        return s.length - 1 - cookieIndex;
    }
}