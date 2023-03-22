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
    
    //약수를 구하는 매서드 
    public int solution(int x) {
        int count = 0;
        
        //제곱근 계산 -> 제곱근은 약수의 개수의 절반을 차지.  
        for(int i = 1; i <= Math.sqrt(x); i++) {
            
            //해당 수와 제곱근 나머지가 0이면 약수 
            if(x % i == 0) {
                
                //제곱근과 해당 수를 나눈 값이 제곱근이 같으면 약수 
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
