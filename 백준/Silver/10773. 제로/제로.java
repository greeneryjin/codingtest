import java.util.*;
import java.io.*;

/**
 * */

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int sum = 0;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());

            if(data == 0) {
                if(!stack.empty()){
                   stack.pop();
                }
            } else {
                stack.push(data);
            }
        }

        while(!stack.empty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
