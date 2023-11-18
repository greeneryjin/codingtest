import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int m;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());
            arr[i] = data;
        }
        Arrays.sort(arr);

        long lt = 1;
        long rt = arr[arr.length - 1];
        long count = 0;

        while(lt <= rt) {
            long mid = (lt + rt) / 2;
            long sum = 0;
            for(int i = 0; i < arr.length; i++) {
                long share = arr[i] / mid;
                sum += share;

                //필요한 개수보다 더 많이 잘랐다는 것은 최대길이가 아닌 것임
            } if(sum >= m) {
                count = mid;
                lt = mid + 1;
                //break -> break 필요없음, while문 조건식에서 중지됨

                //필요한 개수보다 덜 잘랐다는 것은 최대길이보다 더 길게 잘랐음
            } else {
                rt = mid - 1;
            }
        }
        System.out.println(count);
    }
}
