package greedy;

import java.util.Scanner;

public class BOJ11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] value = new int[N];
        for(int i = 0; i<N;i++){
            value[i] = sc.nextInt();
        }
        int cnt = 0;
        while(K != 0){
            for(int i = N-1;i>=0;i--){
                while (value[i] <= K){
                    K -= value[i];
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
