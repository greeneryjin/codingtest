class Solution {
    boolean solution(String s) {
    boolean answer = true;
        
        int pcount = 0;
        int ycount = 0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='p' || s.charAt(i)=='P') {
               pcount++;
            }
            else if (s.charAt(i)=='y' || s.charAt(i)=='Y') {
               ycount++;
            }
          }
        if (pcount != ycount) {
            answer = false;
        }
        return answer;
    }
}
