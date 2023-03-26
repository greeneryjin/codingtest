class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        // x값에 Math.sqrt를 활용하여 n의 제곱 이전 값을 저장함 
        if (Math.pow(x,2) == n)  {
            return (long)Math.pow(x+1,2);
        }
        else {
            return -1;
            }
    }
}


 
