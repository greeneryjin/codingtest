import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        boolean flag = true;

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (true) {
            if(queue.size() == 1) {
                break;
            }
            if(flag) {
                queue.poll();
                flag = false;
            } else {
                Integer data = queue.poll();
                queue.add(data);
                flag = true;
            }
        }
        System.out.println(queue.poll());
    }
}

