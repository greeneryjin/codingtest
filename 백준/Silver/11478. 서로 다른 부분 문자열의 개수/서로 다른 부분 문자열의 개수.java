import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();

        for(int i = 0; i < name.length(); i++) {
            for(int j = i + 1; j <= name.length(); j++) {
                set.add(name.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
