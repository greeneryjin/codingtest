import java.util.*;
class Solution {
    public List<Integer> solution(int[] n) {
        List<Integer> a = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < n.length - 1; i++) {
            for(int j = i + 1; j < n.length; j++) {
                set.add(n[i] + n[j]);
            }
        }
        
        
        Iterator<Integer> it = set.iterator(); // Iterator(반복자) 생성
		while (it.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
            Integer x = it.next();
            a.add(x);
		}
        Collections.sort(a);
        return a;
    }
}