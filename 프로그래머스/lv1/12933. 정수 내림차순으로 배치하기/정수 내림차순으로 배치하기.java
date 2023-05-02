import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = Long.toString(n);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        StringBuffer sb = new StringBuffer(new String(ch));
		sb.reverse();
        String a = sb.toString();
        answer = Long.parseLong(a);
        return answer;
    }
}