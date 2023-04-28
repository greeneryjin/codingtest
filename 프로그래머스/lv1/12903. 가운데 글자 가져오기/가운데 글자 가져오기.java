class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {
            int x = s.length() / 2;
            answer = s.substring(x-1, x +1);
        } else {
            int x = s.length() / 2;
            answer = s.substring(x, x+1);
        }
        return answer;
    }
}