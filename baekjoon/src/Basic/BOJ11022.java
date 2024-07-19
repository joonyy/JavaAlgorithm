package Basic;

import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, a,b,a+b);
        }
    }
}
