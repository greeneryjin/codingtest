import java.util.*;

class Solution {
    public int solution(int n, int[] l, int[] r) {
        int answer = n - l.length;
        Arrays.sort(l);
        Arrays.sort(r);
        
        //여벌을 가지고 온 사람이 도난 당함 
        for(int i = 0; i < l.length; i++) {
            for(int j = 0; j < r.length; j++) {
                if(l[i] == r[j]) {
                    answer++; //도난 당했으나 여벌을 입으면 됨 
                    l[i] = -1;
                    r[j] = -1;
                    break;
                }
            }
        }
        
        
        for(int i = 0; i < l.length; i++) {
            for(int j = 0; j < r.length; j++) {
                if(l[i] - 1 == r[j] || l[i] + 1 == r[j]) {
                    answer++;
                    r[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}