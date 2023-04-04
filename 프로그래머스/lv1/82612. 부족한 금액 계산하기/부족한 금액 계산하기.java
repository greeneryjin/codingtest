import java.io.IOException;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i = 1; i <= count; i++) {
            sum += (price * i);  
        }
        answer = money - sum;
        
        if(answer >= 0) {
            answer = 0;
            return answer;
        } else {
            return Math.abs(answer);
        }
    }
}