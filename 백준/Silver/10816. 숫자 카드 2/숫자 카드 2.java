import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            int data = Integer.parseInt(st.nextToken());
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int data = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(data, 0)).append(' ');
        }
        System.out.print(sb);
    }
}
