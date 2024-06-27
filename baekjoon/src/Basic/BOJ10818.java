package Basic;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long max = -1000000;
        long min = 1000000;
        for(int i = 0 ;i<N;i++){
            int K = sc.nextInt();
            if(K>max) max = K;
            if(K<min) min = K;
        }
        System.out.println(min+ " "+max);
    }
}
