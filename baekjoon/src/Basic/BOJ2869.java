package Basic;

import java.util.Scanner;

public class BOJ2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int dailyLength = (A-B);
        int cnt = ((V-A) / dailyLength); // 닿기 직전.
        if(((V-A) % dailyLength) > 0) cnt++;
        System.out.println(cnt + 1);
    }
}
