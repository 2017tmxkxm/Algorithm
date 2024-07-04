class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);

            if(65 <= temp && temp <= 90) { // 대문자인 경우 > 소문자로 변환
                answer += String.valueOf(temp).toLowerCase();
            } else if (97 <= temp && temp <= 122) { // 소문자인 경우 > 대문자로 변환
                answer += String.valueOf(temp).toUpperCase();
            }
        }
        return answer;
    }
}