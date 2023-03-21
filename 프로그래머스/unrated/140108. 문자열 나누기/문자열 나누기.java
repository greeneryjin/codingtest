class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameCount = 0;
        int notCount = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    sameCount++;
                } else {
                    notCount++;
                }
                
                if(sameCount == notCount || j == s.length() - 1) {
                    i = j+1;
                    answer++;
                }
            }
            sameCount = 0;
            notCount = 0;
        }
        return answer;
    }
}