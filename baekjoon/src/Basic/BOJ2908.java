package Basic;

import java.util.Scanner;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean answer = reverse(a) > reverse(b);
        if(answer) System.out.println(reverse(a));
        else System.out.println(reverse(b));
    }
    static int reverse(int a){
        int ret = a/100;
        a %= 100;
        ret += (a/10)*10;
        a = a% 10;
        ret += a * 100;
        return ret;
    }
}
