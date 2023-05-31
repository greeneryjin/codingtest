class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");
        
        int index = 0;
        for(int i = 0; i < tmp.length; i++) {
            if(tmp[i].equals(" ")) {
                index = 0;
            }
            //1-2.짝수 인데스일 경우
            else if(index %2 == 0){
            	//대문자로 변환
                tmp[i] = tmp[i].toUpperCase();
                //다음 인덱스로 넘어가기
                index++;
            }
            //1-3.
            else{//홀수 인덱스일 경우
            	//소문자로 변환
                tmp[i] = tmp[i].toLowerCase();
                //다음 인덱스로 넘어가기
                index++;
            }
            //1-4.바꾼 값을 answer에 하나씩 더하기
            answer += tmp[i];
        }
        
        
        return answer;
    }
}