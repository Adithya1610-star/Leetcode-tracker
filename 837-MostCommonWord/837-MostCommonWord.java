// Last updated: 7/9/2026, 9:14:20 AM
import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String a[]=paragraph.split(" ");
        String k="";
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer>map=new HashMap<>();
        int max=0;
        String j="";
          for(String f:a){
              if(!bannedSet.contains(f) && !f.isEmpty()){
                map.put(f,map.getOrDefault(f,0)+1);
          if(map.get(f)>max){
              max=map.get(f);
              k=f;
          }
        }
    }
    return k;
}
}