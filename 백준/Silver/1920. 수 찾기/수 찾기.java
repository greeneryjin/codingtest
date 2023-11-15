import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int data = Integer.parseInt(st.nextToken());
            arr[i] = data;
        }
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int data = Integer.parseInt(st.nextToken());

            boolean flag = false;
            int lt = 0;
            int rt = arr.length - 1;
            while(lt <= rt) {
                int mid = (lt + rt) / 2;
                if(data == arr[mid]) {
                    flag = true;
                    break;
                }
                if (data > arr[mid]) {
                    lt = mid + 1;
                } else {
                    rt = mid - 1;
                }
            }
            if(flag) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
}
