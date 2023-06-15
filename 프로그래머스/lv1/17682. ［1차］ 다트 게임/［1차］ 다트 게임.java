import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] chs = dartResult.toCharArray();
        
        int[] arr = new int[3];
        int index = 0; 
        for(int i = 0; i < chs.length; i++) {
            if(48 <= chs[i] && chs[i] <= 57) {
               if(48 <= chs[i + 1] && chs[i + 1] <= 57){
                   String s1 = String.valueOf(chs[i]);
                   String s2 = String.valueOf(chs[i+1]);
                   arr[index] = Integer.valueOf(s1 + s2);
                   i++;
                   index++;
                   continue;
               }
               arr[index] = chs[i] - '0';
               index++;
               continue;
            }
            if(i == 0) continue;
            if(chs[i] == 'S') {
                arr[index - 1] *= 1; 
            } else if(chs[i] == 'D') {
                arr[index - 1] = arr[index - 1] * arr[index - 1];
            } else if(chs[i] == 'T') {
                arr[index - 1] = arr[index - 1] * arr[index - 1] * arr[index - 1];
            } else if(chs[i] == '*') {
               int max = 2;
               for(int j = index - 1; j >= 0; j--) {
                   if(max == 0) break;
                   arr[j] *= 2;
                   max--;
               }
            } else if(chs[i] == '#') {
                arr[index - 1] *= -1;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}