import java.util.*;
class Solution {
    public int solution(int[] d, int b) {
       int a = 0;
       int tmp = 0;
       Arrays.sort(d);
        
       for(int i = 0; i < d.length; i++) {
           tmp += d[i];
           if(tmp > b) {
               a = i;
               break;
           }
       }
       if(tmp <= b) {
         a = d.length;
         return a;
       } 
       return a;
    }
}