// Last updated: 7/9/2026, 9:14:41 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allUpper = word.equals(word.toUpperCase());
        boolean allLower = word.equals(word.toLowerCase());
        boolean titleCase = Character.isUpperCase(word.charAt(0)) &&
                            word.substring(1).equals(word.substring(1).toLowerCase());

        return allUpper || allLower || titleCase;
    }
}