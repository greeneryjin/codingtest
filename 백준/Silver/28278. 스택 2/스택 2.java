import java.io.*;
import java.util.*;

/**
 * */

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());
            if (data == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (data == 2) {
                if (stack.empty()) sb.append(-1).append("\n");
                else sb.append(stack.pop()).append("\n");
            } else if (data == 3) {
                sb.append(stack.size()).append("\n");
            } else if (data == 4) {
                if (stack.empty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else {
                if (stack.empty()) sb.append(-1).append("\n");
                else sb.append(stack.peek()).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}
