import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        //지나온 곳을 저장하는 큐
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0));
        maps[0][0] = 0;

        //크기 계산
        int[][] m = new int[maps.length][maps[0].length];
        m[0][0] = 1;

        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                //배열 범위
                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] == 1) {
                    maps[nx][ny] = 0;
                    q.add(new Point(nx, ny));
                    m[nx][ny] = m[tmp.x][tmp.y] + 1;
                }
            }
        }
        answer = m[maps.length - 1][maps[0].length - 1];
        if(answer == 0) {
            return -1;
        }
        return answer;
    }
}

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}