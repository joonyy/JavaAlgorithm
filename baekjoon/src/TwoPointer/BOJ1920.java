package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        for(int i=0; i < M; i++){
            long checknum = sc.nextLong();
            long start = 0;
            long end = N-1;
            long res = 0;
            while(start <= end){
                long mid = (start + end) / 2;
                if(checknum < A[(int)mid]) end = mid-1;
                else if (checknum > A[(int)mid])start = mid + 1;
                else {
                        res = 1;
                        break;
                }
            }
            System.out.println(res);
        }
    }
}
