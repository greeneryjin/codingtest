import java.util.Scanner;

/**
 * */

public class Main {

    static int n;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(f(n));
    }

    public static int f(int i) {


        if(i == 0) {
            return 0;
        }

        if(i == 1) {
            return 1;
        }

        else {
            return f(i - 1) + f(i - 2);
        }

    }

}
