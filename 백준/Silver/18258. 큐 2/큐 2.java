import java.util.*;
import java.io.*;

/**첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * */

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int sum = 0;
    static LinkedList<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String data = st.nextToken();

            if(data.equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
            } else if(data.equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if(data.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if(data.equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if(data.equals("front")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peekFirst()).append("\n");
                }
            } else {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
