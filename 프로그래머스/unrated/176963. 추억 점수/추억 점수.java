import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) { //행
            for(int j = 0; j < photo[i].length; j++) { //열 
                for(int k = 0; k < name.length; k++) { 
                    if(photo[i][j].equals(name[k])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }
}