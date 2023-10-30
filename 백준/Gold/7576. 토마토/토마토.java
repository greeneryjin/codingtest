import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만, 아직 익지 않은 토마토들도 있을 수 있다.
 * 보관 후 하루가 지나면, 익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다.
 * 하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미한다.
 * 대각선 방향에 있는 토마토들에게는 영향을 주지 못하며, 토마토가 혼자 저절로 익는 경우는 없다고 가정한다.
 * 철수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.
 * 토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때,
 * 며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라.
 * 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.
 * */

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] box;
    static int m, n;
    static int count = 0;
    static int[] rs = {-1, 0, 1, 0};
    static int[] ls = {0, 1, 0, -1};
    static Queue<Step> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int data = Integer.parseInt(st.nextToken());
                box[i][j] = data;
                if(data == 1) {
                    Step step = new Step(i, j);
                    queue.add(step);
                }
            }
        }
        BFS();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(box[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(count - 1);
    }

    public static void BFS() {
        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;

            for (int i = 0; i < size; i++) {
                Step nowNode = queue.poll();

                for (int z = 0; z < rs.length; z++) {
                    int nextR = nowNode.x + rs[z];
                    int nextL = nowNode.y + ls[z];

                    if(0 <= nextR && nextR < n && 0 <= nextL && nextL < m) {
                        if(box[nextR][nextL] == 0) {
                            box[nextR][nextL] = 1;
                            Step step2 = new Step(nextR, nextL);
                            queue.add(step2);
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
