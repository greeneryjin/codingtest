import java.util.*;

public class Solution {
    public int solution(int n) {
        String tmp = String.valueOf(n);
        int answer = 0;
        
        for(int i = 0; i < tmp.length(); i++) {
            answer += Character.getNumericValue(tmp.charAt(i));
        }
        return answer;
    }
}