import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
            char str = my_string.charAt(i);
            
            if(set.add(str)) {
                sb.append(str);
            }
        }
        
        return sb.toString();
    }
}