// Last updated: 7/9/2026, 9:13:57 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(String word:word1) 
        s1.append(word);
        for(String word:word2) 
        s2.append(word);
        return s2.toString().equals(s1.toString());
    }
}