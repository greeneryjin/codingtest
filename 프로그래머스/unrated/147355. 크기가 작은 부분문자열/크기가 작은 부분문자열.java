class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long number = Long.parseLong(p);
        
        //outOfArray 방지 및 p 문자열만큼 뽑기 
        int n = t.length() - p.length();
        int index = p.length();
       
        for(int i = 0; i <= n; i++) {
            String tmp = t.substring(i,i + index);
            long tmps = Long.parseLong(tmp);
            if(tmps <= number) {
                answer++;
            }
        }
        return answer;
    }
}
