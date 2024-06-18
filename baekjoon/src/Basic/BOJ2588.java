package Basic;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = A*B;
        int first = B%10;
        System.out.println(A*first);
        B/=10;
        int second = B%10;
        System.out.println(A*second);
        B/=10;
        int third = B%10;
        System.out.println(A*third);
        System.out.println(ans);
    }
}
