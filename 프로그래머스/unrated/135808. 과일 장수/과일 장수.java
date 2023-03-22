import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 내림차순 정렬 
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int len = score.length;
        int x = 0;
        int index = 0;
        int[] tmp = new int[m];
        
        while(x < len) {
            if(len - index >= m) {
                //m개 만큼 임시 배열에 저장
                for(int i = 0; i < tmp.length; i++) {
                    if(index == len) {
                        break;
                    }//임시 배열에 값 저장
                    tmp[i] = arr[index++];
                }
                //오름차순 정렬 
                Arrays.sort(tmp);
                //가장 큰 값은 항상 맨 앞. 
                answer += (m * 1 * tmp[0]);
                x += m;
            }
            else break;
        }
        return answer;
    }
}
