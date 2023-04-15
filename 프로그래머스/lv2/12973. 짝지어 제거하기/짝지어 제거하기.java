import java.util.*;
class Solution{
    public int solution(String s){
        int answer = -1;
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i < c.length; i++) {
            char ch = c[i];
            if(stack.isEmpty()) {
                stack.push(c[i]);
            } else {
                if(ch == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(c[i]);
                }
            }
        }
        if(stack.size() == 0) {
            return 1;
        } else return 0;
    }
}