class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        //약수의 개수를 구한 후, limit와 비교 -> limit를 넘으면 power로 변경
        //넘지 않으면 그대로 계산 
        for(int i = 1; i <= number; i++) {
            int count = solution(i);
            
            if(count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
    
    public int solution(int x) {
        int count = 0;
        
        for(int i = 1; i <= Math.sqrt(x); i++) {
            if(x % i == 0) {
                if(x / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}