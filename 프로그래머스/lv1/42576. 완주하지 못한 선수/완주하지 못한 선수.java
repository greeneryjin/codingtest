import java.util.*;

class Solution {
    public String solution(String[] p, String[] c) {
        String answer = "";
        HashMap<String, Integer> pp = new HashMap<>();
        
        for(int i = 0; i < p.length; i++) {
            String name = p[i];
            if (pp.containsKey(name)) {
                int count = (int) pp.get(name);
                //중복이 발생 시 value 값으로 중복 체크 
                pp.put(name, ++count);                
            } else {    
                pp.put(name, 1);
            }
        }
        
        for(int i = 0; i < c.length; i++) {
            int count = (int)pp.get(c[i]);
            String name = c[i];
            if(count == 1) {
               pp.remove(name); 
            } else pp.put(name, --count);     
        }
        String temp = pp.keySet().toString();
        answer = temp.substring(1, temp.length()-1);
    return answer;
    }
}