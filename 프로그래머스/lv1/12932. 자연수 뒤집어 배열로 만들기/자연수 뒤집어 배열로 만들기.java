import java.util.*;

class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n); 
        String[] str = num.split(""); 
        int[] answer = new int[str.length]; 

        for(int i=str.length-1; i>=0; i--){ 
            answer[str.length-1-i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}