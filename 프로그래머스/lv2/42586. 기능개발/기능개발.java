import java.util.*;

class Solution {
    public List<Integer> solution(int[] p, int[] s) {
        List<Integer> arr = new ArrayList<>();
        Queue<Integer> que = new LinkedList<Integer>();
        int day = 0; //temp에 적용할 배포일 수
        
        for(int i = 0; i < p.length; i++) {
           while(p[i] + (s[i] * day) < 100){
                day++;
            }
            que.offer(day);
        }
        
        int z = que.remove();
        int count = 1;
        while(!que.isEmpty()) {
            if(z >= que.peek()) {
                count++;
                que.remove();
            } else {
                z = que.remove();
                arr.add(count);
                count = 1;   
            }
            if(que.isEmpty()) {
                arr.add(count);
            }
        }
        
        return arr;
    }
}