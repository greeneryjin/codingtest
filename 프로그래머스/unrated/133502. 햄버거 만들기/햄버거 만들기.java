import java.util.*;

class Solution {
    public int solution(int[] a) {
        int answer = 0;
        String arr = "1231";
        StringBuffer str = new StringBuffer(Arrays.toString(a).replaceAll("[^0-9]",""));
        
       while (str.indexOf(arr) > -1) {
           int i = str.indexOf(arr);
           str.delete(i, i + 4);
           answer++;
       }
        return answer;
    }
}