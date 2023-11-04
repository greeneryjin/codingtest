import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException{

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        //1.)일 때, 스택이 남아있는 지 알 수 없음 -> ) 값을 넣어 주면 됨. 
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String data = st.nextToken();
            Stack<Character> stack = new Stack<>();

            for(int x = 0; x < data.length(); x++) {
                if(data.charAt(x) == '(') {
                    stack.add(data.charAt(x));
                } else {
                    if(stack.isEmpty()){ // ) 값을 넣어 주면 됨. 
                        stack.add(data.charAt(x));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
