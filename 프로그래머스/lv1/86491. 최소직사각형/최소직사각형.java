class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < sizes.length; i++) {
            //가장 긴 가로, 가장 짧은 세로 -> 가로와 세로는 회전 가능
            int x = Math.max(sizes[i][0], sizes[i][1]);
            int y = Math.min(sizes[i][0], sizes[i][1]);

            row = Math.max(row, x);
            col = Math.max(col, y);
        }
        return row * col;
    }
}