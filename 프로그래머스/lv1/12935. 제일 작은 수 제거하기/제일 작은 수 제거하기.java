class Solution {
    public int[] solution(int[] a) {
        int[] answer = {};
        int index = 0;
        if(a.length <= 1) {
            answer= new int[1];
            answer[0]=-1;
            return answer;
        } 
        
        int min = a[0];
        for(int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        
        answer= new int[a.length - 1];
        for(int i = 0; i < a.length; i++) {
            if(min == a[i]) continue;
            answer[index++] = a[i];
        }
        return answer;
    }
}