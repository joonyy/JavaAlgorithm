package Basic;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long N = sc.nextInt();
        long sum = 0;
        for(int i = 0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += ((long) a * b);
        }
        if(sum == X) System.out.println("Yes");
        else System.out.println("No");

    }
}
