class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        String[] arr = str.split("");
        for (int i=0; i<arr.length;i++)
        {    
             answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
