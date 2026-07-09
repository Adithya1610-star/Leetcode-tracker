// Last updated: 7/9/2026, 9:14:30 AM
class Solution {
    public String toLowerCase(String s) {
        String f="";
        for(char c:s.toCharArray()){
           if(Character.isUpperCase(c)){
            c=Character.toLowerCase(c);
           }f+=c;
        }
        return f;
    }
}