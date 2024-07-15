package Basic;

import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int N = sc.nextInt();
        if(N<100) cnt = N;
        else{
            cnt = 99;
            for(int i =100; i<=N;i++){
                int first = i/100;
                int second = (i/10)%10;
                int third = i % 10;

                if(first-second == second-third) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
