import java.util.*;

/**수빈이는 동생과 숨바꼭질을 하고 있다.
 * 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다. 수빈이는 걷거나 순간이동을 할 수 있다.
 * 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
 수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
 * */

public class Main {
    static int[] step = {-1, 1, 2};
    static int level = 0;
    static Queue<Integer> queue = new LinkedList<>();
    static int start;
    static int end;
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();

        if(start == end) {
            System.out.println(level);
        }
        else {
            queue.add(start);
            BFS();
            System.out.println(level);
        }
    }

    public static void BFS() {
        while (!queue.isEmpty()){
            //각 레벨이 가진 노드의 전체 수
            int size = queue.size();
            level++;
            visited[start] = true;

            for (int i = 0; i < size; i++) {
                Integer nowNode = queue.poll();
                int nextNode1 = nowNode + step[0];
                int nextNode2 = nowNode + step[1];
                int nextNode3 = nowNode * step[2];

                if(nextNode1 == end || nextNode2 == end || nextNode3 == end) {
                    return;
                }

                if(nextNode1 >= 0 && nextNode1 <= 100000 && !visited[nextNode1]) {
                    visited[nextNode1] = true;
                    queue.add(nextNode1);
                }

                if(nextNode2 >= 0 && nextNode2 <= 100000 && !visited[nextNode2]) {
                    visited[nextNode2] = true;
                    queue.add(nextNode2);
                }

                if(nextNode3 >= 0 && nextNode3 <= 100000 && !visited[nextNode3]) {
                    visited[nextNode3] = true;
                    queue.add(nextNode3);
                }
            }
        }
    }
}