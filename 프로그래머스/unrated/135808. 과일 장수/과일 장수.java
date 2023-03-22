import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int len = score.length;
        int x = 0;
        int index = 0;
        int[] tmp = new int[m];
        
        while(x < len) {
            if(len - index >= m) {
                for(int i = 0; i < tmp.length; i++) {
                    if(index == len) {
                        break;
                    }
                    tmp[i] = arr[index++];
                }
                Arrays.sort(tmp);
                answer += (m * 1 * tmp[0]);
                x += m;
            }
            else break;
        }
        return answer;
    }
}