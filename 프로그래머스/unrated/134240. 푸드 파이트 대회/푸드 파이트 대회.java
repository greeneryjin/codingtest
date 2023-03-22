class Solution {
    public String solution(int[] food) {
        StringBuffer buff = new StringBuffer();
        
        for(int i = 1; i < food.length; i++) {
            //배열의 값을 두 사람으로 나눈 값을 저장 
            int x = food[i] / 2;
            //음식이 나눌 수 없을 경우, 다음
            if(x == 0) continue;
            else {
                //나눈 값만큼 배열에 저장 
                for(int j = 0; j < x; j++) {
                    buff.append(Integer.toString(i));
                }
            }
        }
        String answer = buff.toString() + "0";
        //배열 뒤집기 
        String reversedStr = buff.reverse().toString();
        return answer + reversedStr;
    }
}
