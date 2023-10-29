import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
 * 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
 * 한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.
 * 위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
 * */

public class Main {


    static int row;
    static int col;
    static int[] rs = {-1, 0, 1, 0};
    static int[] ls = {0, 1, 0, -1};
    static int[][] maze;
    static int[][] visitMaze;
    static Queue<Step> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        maze = new int[row][col];
        visitMaze = new int[row][col];

        for (int i = 0; i < row; i++) {
            String line = bf.readLine();
            for (int j = 0; j < col; j++) {
                maze[i][j] =  line.charAt(j) - '0';
                visitMaze[i][j] = line.charAt(j) - '0';
            }
        }
        Step step = new Step(0, 0);
        queue.add(step);
        maze[0][0] = 0;
        BFS();
        System.out.println(visitMaze[row - 1][col - 1]);
    }

    public static void BFS() {

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Step poll = queue.poll();

                for (int z = 0; z < rs.length; z++) {
                    int r = poll.x + rs[z];
                    int l = poll.y + ls[z];

                    //생각하지 못한 것 -> bfs는 현재 위치에서 상하좌우의 값을 모두 탐색함
                    //ex) dfs(1,5) -> dfs(1,6) or dfs(2,5)
                    if(0 <= r && r < row && 0 <= l && l < col) {
                        if(maze[r][l] == 1){
                            Step step = new Step(r, l);
                            queue.add(step);
                            maze[r][l] = 0;
                            visitMaze[r][l] = visitMaze[poll.x][poll.y] + 1;
                        }
                    }
                }

            }
        }
    }

    public static class Step {
        int x;
        int y;

        public Step(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
