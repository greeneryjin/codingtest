class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0 ;
        int n = x; // 나누기 위한 x 값 저장
        
    // 자릿 수 합 n 구하기
        while (x !=0) {
        sum+= x % 10;
            x /= 10;
    }
    // 10으로 나눈 몫 나머지 

        if (n % sum == 0) return answer;
        else return false;
        }
    }
