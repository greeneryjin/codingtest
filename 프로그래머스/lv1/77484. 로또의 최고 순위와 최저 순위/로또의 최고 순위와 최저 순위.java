class Solution {
    public int[] solution(int[] l, int[] w) {
        int[] answer = new int[2];
        int[] arr = {6, 5, 4, 3, 2, 1};
        int zeroCount = 0;
        int count = 0;
        
        for(int i = 0; i < l.length; i++) {
            if(l[i] == 0) {
                zeroCount++;
            }
            for(int j = 0; j < w.length; j++) {
               if(l[i] == w[j]) {
                   count++;
                   break;
               }
            }
        }
        
        if(count == 0) {
             answer[1] = 6;
             answer[0] = 6;
        }
        
        if(zeroCount == 6) {
             answer[1] = 6;
             answer[0] = 1;
        } else {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == count) {
                    answer[1] = i + 1;
                    answer[0] = (i + 1) - zeroCount;
                }
            }   
        }
        return answer;
    }
}