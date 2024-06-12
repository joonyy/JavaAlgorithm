package TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //N개의 수가 저장될 배열 선언 + 입력
        long[] sumArr = new long[N+1];
        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=N;i++){
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }

        //M번 반복문 시작
        for(int a=0;a<M;a++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[j]-sumArr[i-1]);
        }

    }

}
