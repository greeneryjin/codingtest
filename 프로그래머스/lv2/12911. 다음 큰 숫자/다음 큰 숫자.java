class Solution {
    public int solution(int n) {
        int answer = 0;
        String b1 = Integer.toBinaryString(n);
        int count1 = 0; 
        for(int i = 0; i < b1.length(); i++) {
            if(b1.charAt(i) == '1') {
                count1++;
            }
        }
        int index = 1;
        int x = 0;
        while(true) {
            x = n + index;
            int count2 = 0;
            String b2 = Integer.toBinaryString(x);
            for(int i = 0; i < b2.length(); i++) {
                if(b2.charAt(i) == '1') {
                    count2++;
                }
            }
            if(count1 == count2) {
                answer = x;
                break;
            }
            index++;
        }            
        return answer;
    }
}