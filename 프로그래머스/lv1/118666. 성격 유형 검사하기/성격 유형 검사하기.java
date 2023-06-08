import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        //점수 환산 
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        map2.put(1, 3);
        map2.put(2, 2);
        map2.put(3, 1);
        map2.put(4, 0);// 4보다 작으면 비동의, 크면 동의 
        map2.put(5, 1);
        map2.put(6, 2);        
        map2.put(7, 3); 
        
        //점수 구하기 
        HashMap<Character,Integer> score = new HashMap<Character,Integer>();
       score.put('R', 0);
       score.put('T', 0);
       score.put('C', 0);
       score.put('F', 0);
       score.put('J', 0);
       score.put('M', 0);
       score.put('A', 0);
       score.put('N', 0);        
        for(int i = 0; i < survey.length; i++) {
            Character left = survey[i].charAt(0); //앞:비동의, 뒤: 동의
            Character right = survey[i].charAt(1);
            
            if(choices[i] > 4) { //동의
                //survey[i]; //뒤: 동의 -> 성격 유형 확인 
                //map2의 value값 추출 
                //해당 점수 더하기
               for(Map.Entry<Integer, Integer> key : map2.entrySet()) {
                   if(key.getKey().equals(choices[i])) {
                       score.put(right, score.getOrDefault(right, 0) + key.getValue());
                   }
               }

            } else { //비동의
               //survey[i]; //앞:비동의
               for(Map.Entry<Integer, Integer> key : map2.entrySet()) {
                   if(key.getKey().equals(choices[i])) {
                       score.put(left, score.getOrDefault(left, 0) + key.getValue());
                   }
               }
           } 
        }
        StringBuilder sb = new StringBuilder();
        
        if(score.get('R') >= score.get('T')) {
            sb.append("R");
        } else {
            sb.append("T");
        }
        
        if(score.get('C') >= score.get('F')) {
            sb.append("C");
        } else {
            sb.append("F");
        }
        
        if(score.get('J') >= score.get('M')) {
            sb.append("J");
        } else {
            sb.append("M");
        }
        
        if(score.get('A') >= score.get('N')) {
            sb.append("A");
        } else {
            sb.append("N");
        }
        
        return sb.toString();
    }
}