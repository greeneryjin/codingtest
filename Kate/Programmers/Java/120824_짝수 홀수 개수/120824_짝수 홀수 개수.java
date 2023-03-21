class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        // 배열 선언 
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                answer[0]++;
                // 배열의 첫번째 원소값 증가
                }
            else {
                answer[1]++;
                // 배열의 두번째 원소값 증가
            }
        }         
        return answer;
    }
}
