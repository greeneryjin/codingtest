class Solution {
    public int solution(int n) {
        int x = 0;
        for (int i=2; i < n; i++){
        if(n % i == 1){
            x = i;
            break;
        }   
      }     
    return x;
    }
}
