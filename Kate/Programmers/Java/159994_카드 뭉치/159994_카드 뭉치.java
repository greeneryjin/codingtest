import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int index1 = 0; // 카드 1의 인덱스
        int index2 = 0; // 카드 2의 인덱스

        for(int i=0;i<goal.length;i++){
            if(cards1[index1].equals(goal[i])){  // goal의 카드가 cards1의 카드라면
                index1 = (index1 < cards1.length-1)? index1 + 1 : index1;    // 카드를 모두 순회했으면 인덱스가 더 이상 증가하지 않음
            }else if(cards2[index2].equals(goal[i])){    // goal의 카드가 cards2의 카드라면
                index2 = (index2 < cards2.length-1)? index2 + 1 : index2;// 카드를 모두 순회했으면 인덱스가 더 이상 증가하지 않음
            }else{  // 둘 다 같지 않으면 
               return "No";
            }
        }

        return "Yes";
    }
}
