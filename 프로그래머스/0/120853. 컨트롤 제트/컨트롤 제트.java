class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = s.split(" ");
        
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(String.valueOf('Z'))) {
                answer -= Integer.parseInt(String.valueOf(str[i-1]));
            } else {
                answer += Integer.parseInt(String.valueOf(str[i]));
            }
        }
        return answer;
    }
}