class Solution {
    public long solution(String numbers) {
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for(int i=0; i<numStr.length; i++) {
            numbers = numbers.replaceAll(numStr[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}