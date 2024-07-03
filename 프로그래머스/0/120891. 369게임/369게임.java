class Solution {
    public int solution(int order) {
        String[] str = String.valueOf(order).split("");
        int answer = 0;

        for(int i=0; i< str.length; i++) {
           if(Integer.parseInt(str[i]) == 3 || Integer.parseInt(str[i]) == 6 || Integer.parseInt(str[i]) == 9) {
               answer++;
           }
        }
        return answer;
    }
}