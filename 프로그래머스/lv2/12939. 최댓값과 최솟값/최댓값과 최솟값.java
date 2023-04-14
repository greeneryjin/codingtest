import java.util.*;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        Arrays.sort(arr);
        answer = String.valueOf(arr[0]) + " " + String.valueOf(arr[arr.length-1]);
        return answer;
    }
}