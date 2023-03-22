class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        //배열 뒤쪽을 시작으로 배열 맨 뒤 -> 맨 앞의 순서로 문자열 찾기 
        for(int i = s.length() - 1; i > 0; i--) {
            for(int j = i - 1; j >= 0; j--) {
                if(s.charAt(i) != s.charAt(j)) {
                    answer[i] = -1;  
                } else {
                    answer[i] = i - j;   
                    break;
                }
            }
        }
        return answer;
    }
}
