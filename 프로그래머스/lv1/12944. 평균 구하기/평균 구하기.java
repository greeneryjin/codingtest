class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
        
        return answer = tmp / arr.length;
    }
}