package Basic;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N;i++){
            int tmp = sc.nextInt();
            if(tmp < X){
                System.out.print(tmp +" ");
            }
        }
    }
}
