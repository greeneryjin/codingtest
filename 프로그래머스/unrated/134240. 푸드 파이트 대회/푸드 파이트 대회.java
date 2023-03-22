class Solution {
    public String solution(int[] food) {
        StringBuffer buff = new StringBuffer();
        
        for(int i = 1; i < food.length; i++) {
            int x = food[i] / 2;
            if(x == 0) continue;
            else {
                for(int j = 0; j < x; j++) {
                    buff.append(Integer.toString(i));
                }
            }
        }
        String answer = buff.toString() + "0";
        String reversedStr = buff.reverse().toString();
        return answer + reversedStr;
    }
}