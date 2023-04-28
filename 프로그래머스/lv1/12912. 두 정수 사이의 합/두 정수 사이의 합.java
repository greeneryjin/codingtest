class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
            return a;
        } 
        
        if(a > b) {
            for(int x = b; x <= a; x++) {
                answer += x;
            }
            return answer;
        } else {
            for(int x = a; x <= b; x++) {
                answer += x;
            }
            return answer;
        }
    }
}