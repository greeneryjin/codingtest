import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();

        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            map.put(name, map.getOrDefault(name, 0) + 1);
            if(map.get(name) == 2) {
                list.add(name);
            }
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
