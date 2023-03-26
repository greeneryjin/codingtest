import java.util.*;

class Solution {
   public int[] solution(String[] id, String[] report, int k) {
        int[] answer = new int[id.length];
        HashMap<String, Set<String>> map1 = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<id.length;i++){
            arr.add(id[i]);
        }
        for(int i = 0; i < report.length; i++){
            String[] tmp = report[i].split(" ");
            if(!map1.containsKey(tmp[1])){
                map1.put(tmp[1], new HashSet<>());
            }            
            map1.get(tmp[1]).add(tmp[0]);     
        }
       
       for(String str: map1.keySet()){
            Set<String> tmp = map1.get(str);
            if(tmp.size() >= k){
                for(String st: tmp){
                    answer[arr.indexOf(st)]++;
                 } 
           }
       }
       
       
        return answer;
  }
}