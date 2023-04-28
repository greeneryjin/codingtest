import java.util.*;

class Solution {
    public List<Integer> solution(int[] a, int d) {
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < a.length; i++) {
            if(a[i] % d == 0) {
                arr.add(a[i]);
            }
        }
        if(arr.size() == 0) {
            arr.add(-1);
            return arr;
        }
        Collections.sort(arr);
        return arr;
    }
}