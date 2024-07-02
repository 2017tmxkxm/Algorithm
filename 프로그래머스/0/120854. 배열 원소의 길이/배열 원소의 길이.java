import java.util.ArrayList;
class Solution {
    public ArrayList solution(String[] strlist) {
        ArrayList answer = new ArrayList<>();
        
        for(int i=0; i<strlist.length; i++) {
            answer.add(strlist[i].length());
        }
        return answer;
    }
}