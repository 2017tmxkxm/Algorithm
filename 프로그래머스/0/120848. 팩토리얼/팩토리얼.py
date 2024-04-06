from math import factorial

def solution(n):
    answer = 0
    
    while (n >= factorial(answer)):
        answer += 1
        
    return answer -1