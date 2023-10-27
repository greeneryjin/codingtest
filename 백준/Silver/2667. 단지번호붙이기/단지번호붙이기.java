import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * <그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다.
 * 철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다.
 * 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다.
 * <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 지도를 입력하여 단지수를 출력하고,
 * 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
 * */

public class Main {

    static int[] rs = {-1, 0, 1, 0};
    static int[] ls = {0, 1, 0, -1};
    static int n;
    static int count = 0; //단지 수
    static int[][] maze; //아파트 정보
    static boolean[][] visit; //방문
    private static int[] counts = new int[25*25]; //아파트 단지 개수(최대 행렬 5*5)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        maze = new int[n][n];
        visit = new boolean[n][n];

        //전체 사각형 입력 받기
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < n; j++) {
                //next는 한 줄을 읽는데 공백을 포함하지 않는다.
                //nextLine은 할 줄을 읽는데 공백을 포함해서 읽는다.
                maze[i][j] = input.charAt(j) - '0';
            }
        }

        //배열 순회
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if (maze[i][j] == 1 && !visit[i][j]) {
                    //dfs 재귀가 다시 돌아올 때 값이 증가
                    count++;
                    DFS_one(i, j);
                }
            }
        }
//        DFS_two(0, 0);
//        DFS_three(0, 0);
        Arrays.sort(counts);
        System.out.println(count);
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] != 0) System.out.println(counts[i]);
        }

    }

    //1. 다시 되돌아가는 방법 찾기 -> dfs 재귀
    //2. 배열 순회 방법 찾기 -> for문을 돌려서 순회(내가 생각 못한 것: 현재 위치 0이면 다른 열을 찾는 것)
    private static void DFS_one(int r, int l) {

        //현재 위치
        maze[r][l] = 0;
        visit[r][l] = true;
        counts[count]++;

        //상하좌우 갈 수 있는 곳 찾기
        for (int z = 0; z < rs.length; z++) {
            int nextR = r + rs[z];
            int nextL = l + ls[z];

            //배열 범위
            if (0 <= nextR && nextR < n && 0 <= nextL && nextL < n) {
                if (maze[nextR][nextL] == 1) {
                    DFS_one(nextR, nextL);
                }
            }
        }
    }

    //스택이 필요하지 않은 문제
//    private static void DFS_two(int r, int l) {
//          for (int i = 0; i < maze.length; i++) { //현재 위치에서 방문체크를 안함
//              for (int j = 0; j < maze.length; j++) {


//                   for (int z = 0; z < rs.length; z++) {
//                        int nextR = i - rs[z];
//                         int nextL = j - ls[z];
//
//                         //배열 범위
//                    if(0 < nextR && nextR < n && 0 < nextL && nextL < n) {
//                          if(maze[nextR][nextL] == 1) {
//                               Step step = new Step(nextR, nextL);
//                               stack.push(step);
//                               maze[nextR][nextL] = 0;
//                               mazeCount[nextR][nextL] = count;
//                          }
//                     }
//              }
//           }
//
//            if (!stack.empty()) {
//                Step pop = stack.pop();
//                int beforeR = pop.r;
//                int beforeL = pop.l;
//            }
//        }
//    }
//
//
//    private static void DFS_three(int r, int l) {
//
//        for (int z = 0; z < rs.length; z++) {
//            int nextR = r + rs[z];
//            int nextL = l + ls[z];
//
//            //배열 범위
//            if(0 < nextR && nextR < n && 0 < nextL && nextL < n) {
//                if(maze[nextR][nextL] == 1) {
//                    Step step = new Step(nextR, nextL);
//                    stack.push(step);
//                    maze[nextR][nextL] = 0;
//                    visit[nextR][nextL] = true;
//                    DFS_one(nextR, nextL);
//                }
//            }
//        }
//    }
//    public static class Step {
//        int r;
//        int l;
//
//        public Step(int r, int l) {
//            this.r = r;
//            this.l = l;
//        }
//    }
}

