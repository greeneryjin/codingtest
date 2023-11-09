import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static HashMap<String, String> map1 = new HashMap<>();
    static HashMap<String, String> map2 = new HashMap<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            map1.put(s, String.valueOf(i));
            map2.put(String.valueOf(i), s);
        }

        String[] arr = new String[m];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            arr[i] = s;
        }

        for(int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if(map1.containsKey(s)) {
                sb.append(map1.get(s)).append("\n");
            }else if(map2.containsKey(s)) {
                sb.append(map2.get(s)).append("\n");
            }
        }
        System.out.println(sb);

        //비효율적인 시간복잡도를 가짐 -> arr 배열 인덱스마다 map 전체를 스캔해야함.
//        for(int i = 1; i < arr.length; i++) {
//            String monster = arr[i];
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                String key = entry.getKey();
//                String value = entry.getValue();
//
//                if(key.equals(monster)) {
//                    sb.append(value).append("\n");
//                } else if(value.equals(monster)) {
//                    sb.append(key).append("\n");
//                }
//            }
//        }
    }
}
