
/**
 * 신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다. 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
 * 어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때,
 * 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    static boolean[] visit;
    static int[][] arr;

    static int n;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //정점

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken()); //간선의 개수

        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 1; i <= v; i++) { //배열은 1부터 n+1했기 때문에 간선의 개수만큼 넣어야함
            st = new StringTokenizer(br.readLine());
            int ln = Integer.parseInt(st.nextToken());
            int rn = Integer.parseInt(st.nextToken());

            arr[ln][rn] = 1;
            arr[rn][ln] = 1;
        }
        DFS(1);
        System.out.println(count - 1);
    }

    private static void DFS(int index) {

        count++;
        visit[index] = true;
        for (int i = 1; i <= n; i++) { //행렬이 가진 열만큼 확인
            if(arr[index][i] == 1 && !visit[i]) { //대칭 행렬이라 좌우, 우좌나 값이 같음
                DFS(i);
            }
        }
    }
}