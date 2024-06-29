package Basic;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < N; i++){
            int K = sc.nextInt();
            if(isPrime(K)) cnt++;
        }
        System.out.println(cnt);
    }
    public static boolean isPrime(int a){
        if(a<=1) return false;
        for(int i=2;i<a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
