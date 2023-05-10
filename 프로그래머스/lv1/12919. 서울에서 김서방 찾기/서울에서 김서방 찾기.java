class Solution {
    public String solution(String[] s) {
        int j = 0; 
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("Kim")) {
                j = i;
                break;
            }
        }
        return "김서방은 " + j + "에 있다";
    }
}