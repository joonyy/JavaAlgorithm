package Basic;

import java.util.Scanner;

public class BOJ10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }

    static int Fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return Fibo(n-1) + Fibo(n-2);
    }
}
