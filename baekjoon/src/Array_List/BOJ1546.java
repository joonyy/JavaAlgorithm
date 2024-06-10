package Array_List;

import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Max = -2000;
        int sum = 0;

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            Max = Math.max(Max, arr[i]);
            sum += arr[i];
        }
        System.out.println(sum*100.0/Max/N);
    }
}
