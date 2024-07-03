class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<3; i++) {
            if(max < sides[i]) {
                max = sides[i];
            }
            sum += sides[i];
        }

        if(sum-max > max) {
            answer = 1;
        } else if(sum-max <= max)  {
            answer = 2;
        }
        
        return answer;
    }
}