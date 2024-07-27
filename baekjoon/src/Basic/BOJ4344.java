package Basic;

import java.util.Scanner;

public class BOJ4344 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int C = sc.nextInt();

        for(int i = 0; i<C; i++){
            int N = sc.nextInt();
            int sum = 0;
            int cnt = 0;
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = (double) sum/N;
            for(int j = 0; j<N;j++){
                if(arr[j] > avg) cnt++;
            }
            double ans = (double) cnt / N * 100;
            System.out.printf("%.3f%%\n", ans);
        }
    }
}
