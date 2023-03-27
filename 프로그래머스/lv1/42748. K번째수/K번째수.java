import java.util.*;

class Solution {
    public int[] solution(int[] a, int[][] c) {
        int[] answer = new int[c.length];
        
        for(int i = 0; i < c.length; i++) {
            int x = c[i][0];
            int y = c[i][1];
            int z = c[i][2] - 1;

            int[] arr = new int[y-x+1];
            int count = 0;
            for(int j = 0; j <= y-x; j++) {
                arr[count++] = a[j + x - 1];
            }
            
            Arrays.sort(arr);
            answer[i] = arr[z];
        }
        return answer;
    }
}