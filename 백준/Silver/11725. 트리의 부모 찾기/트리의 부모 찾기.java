import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] parents;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int data1 = Integer.parseInt(st.nextToken());
            int data2 = Integer.parseInt(st.nextToken());

            list.get(data1).add(data2);
            list.get(data2).add(data1);
        }

        visited = new boolean[n+1];
        parents = new int[n+1];
        visited[1] = true;
        DFS(1);

        for(int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    }

    private static void DFS(int n) {
        ArrayList<Integer> node = list.get(n);
        for(int i = 0; i < node.size(); i++) {
            Integer nextNode = node.get(i);
            if(!visited[nextNode]) {
                parents[nextNode] = n;
                visited[nextNode] = true;
                DFS(nextNode);
            }
        }
    }
}
