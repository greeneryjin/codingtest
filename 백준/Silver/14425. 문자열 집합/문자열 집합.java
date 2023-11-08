import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> b = new HashMap<>();

        for(int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String data = st.nextToken();
            b.put(data , 0);
        }
        
        int count = 0;
        for(int i = 0 ; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String data = st.nextToken();
            if(b.containsKey(data)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
