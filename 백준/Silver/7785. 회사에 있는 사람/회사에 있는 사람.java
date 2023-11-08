import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, String> b = new HashMap<>();

        for(int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String data1 = st.nextToken();
            String data2 = st.nextToken();
            if(b.containsKey(data1)) {
                b.remove(data1);
            }
            else {
                b.put(data1, data2);
            }
        }

        Set<String> keySet = b.keySet();
        List<String> list = new ArrayList<>(keySet);
        Collections.sort(list, Collections.reverseOrder());

        for (String key : list) {
            System.out.println(key);
        }
    }
}
