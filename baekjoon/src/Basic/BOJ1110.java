package Basic;

import java.util.Scanner;
public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        if(N<10) N*=10;
        int result = N;
        while(true){
            result = (result%10)*10 +(result/10 + result%10)%10;
            cnt++;
            if(result == N) break;
        }
        System.out.println(cnt);

    }
}
