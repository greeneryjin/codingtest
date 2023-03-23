class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int tmp = 0;
        boolean answer = true;
        
        for(int i = 0; i < str.length(); i ++) {
            tmp += Character.getNumericValue(str.charAt(i));
        }
        
        if(x % tmp == 0) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}