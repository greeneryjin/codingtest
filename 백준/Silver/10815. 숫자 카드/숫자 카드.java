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
        int[] findArr = new int[m];
        st = new StringTokenizer(br.readLine()); //한 줄 읽기 열기
        for(int i = 0; i < m; i++) {
            int data = Integer.parseInt(st.nextToken()); //한 줄을 공백 기준으로 읽기
            int lt = 0;
            int rt = arr.length - 1;
            //lt가 rt보다 커지거나 rt가 lt보다 작아짐 둘 다 거짓이기 때문에 while문 벗어남
            while(lt <= rt) {
                int mid = (lt + rt)/2;
                if(data == arr[mid]) {
                    findArr[i] = 1;
                    break;
                } if(data < arr[mid]) { //찾는 값보다 중간 값이 클 경우 배열의 앞쪽을 찾기
                    rt = mid - 1;
                } else { //찾는 값보다 중간 값이 작을 경우 배열의 뒤쪽을 찾기
                    lt = mid + 1;
                }
            }
        }
        for(int i = 0; i < findArr.length; i++) {
            System.out.print(findArr[i]+ " ");
        }
    }
}
