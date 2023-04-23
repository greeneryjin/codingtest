import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] w) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        int index = 0;
        list.add(w[0]);
        
        for(int i = 1; i < w.length; i++) {
            if(!list.contains(w[i])) {
                String pre = list.get(index);
                String con = w[i];
                if(con.charAt(0) != pre.charAt(pre.length() - 1)) {
                   int order = (i / n) + 1;
                   int num = (i % n) + 1;
                    answer[0] = num; 
                    answer[1] = order;
                    return answer;
                }
                index++;
                list.add(w[i]);
            } else {
                int order = (i / n) + 1 ;
                int num = (i % n) + 1;
                answer[0] = num; 
                answer[1] = order;
                return answer;
            }
        }
        return answer;
    }
}