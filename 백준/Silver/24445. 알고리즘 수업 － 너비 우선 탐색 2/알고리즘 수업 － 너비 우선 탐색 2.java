
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int visit[]; // 방문 확인
    static int count; // 방문 순서
    static ArrayList<ArrayList<Integer>> lists = new ArrayList<>(); //BFS

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        // false 초기화
        visit = new int[n+1];

        //인접 리스트 초기화
        for (int i = 0; i <= n; i++) {
            lists.add(new ArrayList<>());
        }

        for(int i = 1; i <= v; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp1 = Integer.parseInt(st.nextToken());
            int tmp2 = Integer.parseInt(st.nextToken());

            lists.get(tmp1).add(tmp2);
            lists.get(tmp2).add(tmp1);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(lists.get(i), Collections.reverseOrder());
        }

        count = 1;
        //DFS(s);
        BFS(s);
        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void BFS(int s) {
        visit[s] = count++;
        queue.add(s);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            for (int i = 0; i < lists.get(poll).size(); i++) {
                Integer node = lists.get(poll).get(i);
                if(visit[node] != 0) {
                    continue;
                }
                queue.add(node);
                visit[node] = count++;
            }
        }
    }

    public static void DFS(int s) { // 인접 리스트

        visit[s] = count;
        ArrayList<Integer> integers = lists.get(s);
        for (int i = 0; i < integers.size(); i++) {
            Integer node = integers.get(i);
            if(visit[node] == 0) {
                count++;
                DFS(node);
            }
        }
    }


}