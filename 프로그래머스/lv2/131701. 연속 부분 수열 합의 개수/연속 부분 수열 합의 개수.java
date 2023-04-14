import java.util.*;

class Solution {
    public int solution(int[] e) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        int len = e.length;
        for(int i = 0; i < e.length; i++) {
            set.add(e[i]);
        }
        for(int i = 1; i < len; i++) {
            for(int j = 0; j < len; j++) {
                int x = i + j;
                int tmp = 0;
                for(int z = j; z <= x; z++) {
                    if(z > e.length - 1) {
                        tmp += e[z - e.length];
                    } else {
                         tmp += e[z];
                    }
                }
                set.add(tmp);
            }
        }
        answer = set.size();
        return answer;
    }
}