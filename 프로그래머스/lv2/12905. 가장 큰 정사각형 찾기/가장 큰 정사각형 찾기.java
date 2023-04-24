class Solution
{
    public int solution(int [][]b)
    {
        int answer = 1234;
        int[][] na = new int[b.length + 1][b[0].length + 1];
        //배열 복사
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                na[i + 1][j + 1] = b[i][j];
            }
        }
        int max = 0;
        for (int i = 1; i < na.length; i++) {
            for (int j = 1; j < na[i].length; j++) {
                if(na[i][j] == 1) {
                    int x = na[i - 1][j - 1];
                    int y = na[i-1][j];
                    int z = na[i][j-1];
                    int min = Math.min(x, Math.min(y, z));
                    na[i][j] = min + 1;
                    max = Math.max(max, min+1);
                }
            }
        }
        return answer = max * max;
    }
}