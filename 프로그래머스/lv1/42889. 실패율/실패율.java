import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        //스테이지 개수를 담은 배열 
        int[] tmp = new int[N];
        //스테이지 번호를 기억하는 배열 
        int[] answer = new int[N];
        
        int count = 0;
        for(int i = 0; i < stages.length; i++) {
            if(stages[i] == -1) continue;
            if(stages[i] > N) continue;
            int le = stages[i];
            for(int j = 0; j < stages.length; j++) {
                if(le == stages[j]) {
                    count++;
                    stages[j] = -1;
                }
            }   
            tmp[le - 1] = count;
            count = 0;
        }
       HashMap<Integer, Double> m = new HashMap<>();
       int len = stages.length;
       for(int i = 0; i < tmp.length; i++) {
           if(tmp[i] == 0) {
               m.put(i + 1, 0.0);
           }
           double s = (double)tmp[i] / (double)len;
           m.put(i + 1, m.getOrDefault(i + 1, s));
           len -= tmp[i];
       }
        
       List<Integer> keySet = new ArrayList<>(m.keySet());
       keySet.sort((o1, o2) -> m.get(o2).compareTo(m.get(o1)));
       for(int i = 0; i < keySet.size(); i++) {
           Integer key = keySet.get(i);
            answer[i] = key;
       }
        
        return answer;
    }
}