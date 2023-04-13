class Solution {
    static int sum = 0;
    static int index = 0;
    static int result = 0;
    
    public int solution(int[] n, int t) {
        bfs(n, t, index, sum);
        return result;
    }
    
    public static void bfs(int[] n, int t, int index, int sum) {
        if(index == n.length) {
            if(sum == t) {
                result++;
            }
            return;
        }
        bfs(n, t, index + 1, sum + n[index]);  
        bfs(n, t, index + 1, sum - n[index]);  
    }
}