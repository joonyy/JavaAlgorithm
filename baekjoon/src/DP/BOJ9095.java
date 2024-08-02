package DP;

import java.util.Scanner;

public class BOJ9095 {
    static int[] DP = new int[12];
    public static void main(String[] args) {
        //기저 조건
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++) {
            int n = sc.nextInt();
            //DP에 필요한 부분까지 정리
            checksum(n);
            System.out.println(DP[n]);
        }
    }

    private static void checksum(int n) {
        //이미 계산된 값이라면 건너뛰기
        if(DP[n] != 0)return;
        //관계 설정
       for(int i = 4; i<= n; i++) {
           if(DP[i] == 0) {
               DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
           }
       }
    }
}
