class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] str = {"a", "e", "i", "o", "u"};
        
        for(String val : str) {
            answer = answer.replaceAll(val, "");
        }
        
        return answer;
    }
}