class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameCount = 0;
        int notCount = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                
                //배열 i와 배열 j를 비교하고 같은 값과 다른 값을 구함 
                if(s.charAt(i) == s.charAt(j)) {
                    sameCount++;
                } else {
                    notCount++;
                }
                //같은 값과 다른 값이 같으면 i를 j로 이동 && j 길이가 전체 길이를 벗어나지 않도록 작업 
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
