package Basic;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 1;
        for(int i=1;i<=N;i++){
            ret *=i;
        }
        System.out.println(ret);
    }
}
