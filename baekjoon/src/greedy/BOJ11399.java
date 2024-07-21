package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] time = new int[N];
        for(int i = 0; i<N;i++){
            time[i] = sc.nextInt();
        }
        long sum = 0;
        Arrays.sort(time);
        for(int i =0; i<N;i++){
            sum += ((long)(N-i) *(long)time[i]);
        }
        System.out.println(sum);
    }
}
