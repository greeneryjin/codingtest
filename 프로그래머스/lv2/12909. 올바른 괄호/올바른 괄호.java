import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack  = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            if(c1 == '(') {
                stack.push(c[i]);
            } 
            
            if(c1 == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                else stack.pop();
            }
        }
       if(stack.isEmpty()) {
           return true;
       } return false;
    }
}