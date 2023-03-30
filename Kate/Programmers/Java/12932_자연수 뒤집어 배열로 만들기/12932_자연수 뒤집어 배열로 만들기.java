class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        // 문자열로 변환
        String[] arr = s.split("");
        // split 메서드 사용해서 나눈 값으로 배열 만들기 

        int[] answer = new int[arr.length];
        // for 문 이용하여 새로운 배열 
        for(int i=0; i<arr.length; i++){
        answer[i] =Integer.parseInt(arr[arr.length-1-i]);
        }


        return answer;
        }
}
