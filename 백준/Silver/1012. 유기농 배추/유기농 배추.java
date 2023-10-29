import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 차세대 영농인 한나는 강원도 고랭지에서 유기농 배추를 재배하기로 하였다. 농약을 쓰지 않고 배추를 재배하려면 배추를 해충으로부터 보호하는 것이 중요하기 때문에,
 * 한나는 해충 방지에 효과적인 배추흰지렁이를 구입하기로 결심한다.
 * 이 지렁이는 배추근처에 서식하며 해충을 잡아 먹음으로써 배추를 보호한다.
 * 특히, 어떤 배추에 배추흰지렁이가 한 마리라도 살고 있으면 이 지렁이는 인접한 다른 배추로 이동할 수 있어, 그 배추들 역시 해충으로부터 보호받을 수 있다.
 * 한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우에 서로 인접해있는 것이다.
 * 한나가 배추를 재배하는 땅은 고르지 못해서 배추를 군데군데 심어 놓았다.
 * 배추들이 모여있는 곳에는 배추흰지렁이가 한 마리만 있으면 되므로 서로 인접해있는 배추들이 몇 군데에 퍼져있는지 조사하면 총 몇 마리의 지렁이가 필요한지 알 수 있다.
 * 예를 들어 배추밭이 아래와 같이 구성되어 있으면 최소 5마리의 배추흰지렁이가 필요하다. 0은 배추가 심어져 있지 않은 땅이고, 1은 배추가 심어져 있는 땅을 나타낸다.
 * */

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[] rs = {-1, 0, 1, 0};
    static int[] ls = {0, 1, 0, -1};
    static int count = 0; //지렁이 개수
    static int[][] maze; //배추 정보
    static boolean[][] visit; //배추 방문
    static int[] testCase; //테스트 케이스
    static int row;
    static int col;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        testCase = new int[n];
        for (int i = 0; i < n; i++) {
            //row == 가로, column == 세로
            st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            int total = Integer.parseInt(st.nextToken());

            maze = new int[row][col];
            visit = new boolean[row][col];

            //전체 사각형 입력 받기
            for (int j = 0; j < total; j++) {
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());
                maze[r][l] = 1;
            }
            //DFS 계산하는 함수
            //배열 순회
            for (int x = 0; x < row; x++) {
                for (int y = 0; y < col; y++) {
                    if (maze[x][y] == 1) {
                        //dfs 재귀가 다시 돌아올 때 값이 증가
                        DFS_one(x, y);
                        count++;
                    }
                }
            }
            testCase[i] = count;
            count = 0;
        }

        for (int i = 0; i < testCase.length; i++) {
            System.out.println(testCase[i]);
        }
    }

    //1. 다시 되돌아가는 방법 찾기 -> dfs 재귀
    //2. 배열 순회 방법 찾기 -> for문을 돌려서 순회(내가 생각 못한 것: 현재 위치 0이면 다른 열을 찾는 것)
    //3. 출력하는 방법 -> 각 단지 개수를 count -> count를 배열을 넣으면 단지 당 아파트의 개수가 나옴
    private static void DFS_one(int r, int l) {

        //현재 위치
        maze[r][l] = 0;
        visit[r][l] = true;

        //상하좌우 갈 수 있는 곳 찾기
        for (int z = 0; z < rs.length; z++) {
            int nextR = r + rs[z];
            int nextL = l + ls[z];

            //배열 범위
            if (0 <= nextR && nextR < row && 0 <= nextL && nextL < col) {
                if (maze[nextR][nextL] == 1) {
                    DFS_one(nextR, nextL);
                }
            }
        }
    }
}

