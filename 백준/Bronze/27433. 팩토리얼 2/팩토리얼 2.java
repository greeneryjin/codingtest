import java.util.Scanner;

/**
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * */

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DFS(n));
    }

    public static long DFS(int n){
        if(n <= 0) {
            return 1;
        }
        return n * DFS(n-1);
    }
}
