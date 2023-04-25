import java.util.*;

public class Solution {
    public Stack<Integer> solution(int [] arr) {
        Stack<Integer> stack  = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(Integer.valueOf(arr[i]));
            }
            else if(stack.peek() != arr[i]) {
                 stack.push(Integer.valueOf(arr[i]));
            }
        }

        return stack;
    }
}