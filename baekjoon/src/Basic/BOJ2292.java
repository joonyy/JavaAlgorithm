package Basic;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
    static int check(int n){
        int cnt = 0;
        int length = n;
        for(int i = 0; i<=length; i++){
            if(n<=0) break;
            if(i == 0) n -= 1;
            else n -= 6*i;
            cnt++;
        }
        return cnt;
    }
}
