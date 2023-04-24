import java.util.Arrays;
class Solution {
    public int solution(int []a, int []b) {
        int answer = 0;
        //가장 큰 값 * 가장 작은 값이 가장 최소값을 만들 수 있습니다. 
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[a.length - 1 - i];
        }
        
        return answer;
    }
}