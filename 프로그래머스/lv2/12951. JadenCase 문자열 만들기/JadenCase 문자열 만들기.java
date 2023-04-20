import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String lowerCase = s.toLowerCase(Locale.ROOT);
        char[] arr = lowerCase.toCharArray();
        boolean flag= true;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                if(flag && 97 <= arr[i] && arr[i] <= 122) {
                   // for(int j = 0; j < count; j++) {
                   //     answer += " "; 
                   // }
                   char c = (char)(arr[i] - 32);
                   answer += c;
                   flag = false; 
                   count = 0;
                } else if(48 <= arr[i] && arr[i] <= 57) {
                    answer += arr[i];
                    flag = false; 
                } else {
                    answer += arr[i];
                }
            } else {
                flag = true;
                answer += " ";
                continue;
            }
        }
        return answer;
    }
}