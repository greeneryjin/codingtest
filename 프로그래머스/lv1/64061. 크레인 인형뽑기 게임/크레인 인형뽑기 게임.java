import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //1.가장 위의 인형이 쌓인다
        //2.같은 인형이 2개 이상이면 사라짐 
        //3.인형이 없는 곳은 인형이 집어지지 않음
        //결론은 사라진 인형의 개수를 출력
        Stack<Integer> s = new Stack<>();
        
        //크레인 이동시키기 
        for(int k = 0; k < moves.length; k++) {
            int j = moves[k] - 1;
            for(int i = 0; i < board.length; i++) {
            //인형 확인하기      
            if(k != 0 && !s.empty()) {
                if(board[i][j] != 0 && board[i][j] == s.peek()) {
                    board[i][j] = 0;
                    s.pop();
                    answer += 2;
                    break;
                }
            }
            //크레인에서 받은 위치를 인형의 위치를 찾고 인형을 스택에 넣기
                if(board[i][j] != 0) {
                    s.push(board[i][j]); 
                    board[i][j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}