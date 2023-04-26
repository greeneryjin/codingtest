class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for (int i=0; i < phone_number.length(); i++)
        {
            if (i < phone_number.length()-4 ) {
                answer += "*";
        }
            else {
                answer += phone_number.charAt(i);
                // charAt : 문자열에서 특정 위치의 문자(char)를 리턴
            }
        }
        return answer;
    }
}
