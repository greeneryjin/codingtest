import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while(true) {
            s = br.readLine();
            if(s.charAt(0) == '.'){
                break;
            }
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.add(s.charAt(i));
                } else if(s.charAt(i) == ')') {
                    if(stack.isEmpty() || stack.peek() != '(') { // '(' 짝은 ')' 균형을 이루려면 peek 값이 짝꿍이여야 한다.
                        stack.add(s.charAt(i));
                        break;
                    } else{
                        stack.pop();
                    }
                } else if(s.charAt(i) == ']') {
                    if(stack.isEmpty() || stack.peek() != '[') { // '[' 짝은 ']' 균형을 이루려면 peek 값이 짝꿍이여야 한다.
                        stack.add(s.charAt(i));
                        break;
                    } else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
